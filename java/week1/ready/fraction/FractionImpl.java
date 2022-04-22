package fraction;

public class FractionImpl implements Fraction {
    /**
     * Parameters are the <em>numerator</em> and the <em>denominator</em>.
     * Normalize the fraction as you create it.
     * For instance, if the parameters are <pre>(8, -12)</pre>, create a <pre>Fraction</pre> with numerator
     * <pre>-2</pre> and denominator <pre>3</pre>.
     *
     * The constructor should throw an <pre>ArithmeticException</pre> if the denominator is zero.
     *
     * @param numerator
     * @param denominator
     */
    private int numerator;
    private int denominator;

    //greatest common denominator helper function
    public int gcd(int a, int b){

        if(b == 0)
            return a;
        return gcd(b, a % b);
    }

    public FractionImpl(int numerator, int denominator) {
        // TODO
        int gcd = 0;

        //throw error if denominator is 0
        if (denominator == 0) {
            throw new ArithmeticException("Division by zero");
        } else if (denominator < 0) {
            //move symbol if denominator is negative
            this.numerator = -numerator;
            this.denominator = Math.abs(denominator);

            //normalise fraction
            int divisor = gcd(Math.abs(numerator), denominator);
            this.numerator = numerator / divisor;
            this.denominator =  denominator / divisor;

        } else {
            gcd = gcd(numerator, denominator);
            this.numerator = numerator / gcd;
            this.denominator = denominator / gcd;

            //normalise fraction

            int divisor = gcd(Math.abs(numerator), denominator);
            this.numerator = numerator / divisor;
            this.denominator = denominator / divisor;

        }


    }

    /**
     * The parameter is the numerator and <pre>1</pre> is the implicit denominator.
     *
     * @param wholeNumber representing the numerator
     */
    public FractionImpl(int wholeNumber) {
        // TODO
        this.numerator = wholeNumber;
        this.denominator = 1;
    }

    /**
     * The parameter is a <pre>String</pre> containing either a whole number, such as `5` or `-3`, or a fraction,
     * such as "8/-12".
     * Allow blanks around (but not within) integers.
     * The constructor should throw an <pre>ArithmeticException</pre>
     * if given a string representing a fraction whose denominator is zero.
     * <p>
     * You may find it helpful to look at the available String API methods in the Java API.
     *
     * @param fraction the string representation of the fraction
     */
    public FractionImpl(String fraction) {
        // TODO

        //check if parameter is a valid fraction and convert to integers

        if(fraction.contains("/")){
            String[] numbers = fraction.split("/");
            int newNumerator = Integer.parseInt(numbers[0].trim());
            int newDenominator = Integer.parseInt(numbers[1].trim());

            if(numbers.length != 2 || newDenominator == 0){
                throw new ArithmeticException("Fraction not valid");
            }
            else {
                this.numerator = newNumerator;
                this.denominator = newDenominator;
            }

        }
        //check if parameter is a whole-number
        else{
            try{

            this.numerator = Integer.parseInt(fraction.trim());
            this.denominator = 1;
            }
            catch(NumberFormatException e){
                throw new ArithmeticException("Exception");
            }
        }
    }

    /**
     * @inheritDoc
     */
    @Override
    public Fraction add(Fraction f) {

        FractionImpl other = (FractionImpl) f;
        int denominator = this.denominator * other.denominator;
        int numerator = this.numerator * other.denominator + this.denominator * other.numerator;

        return new FractionImpl(numerator, denominator);

    }

    /**
     * @inheritDoc
     */
    @Override
    public Fraction subtract(Fraction f) {

        FractionImpl other = (FractionImpl) f;
        int denominator = this.denominator * other.denominator;
        int numerator = this.numerator * other.denominator - this.denominator * other.numerator;

        return new FractionImpl(numerator, denominator);

    }

    /**
     * @inheritDoc
     */
    @Override
    public Fraction multiply(Fraction f) {

        FractionImpl other = (FractionImpl) f;

        int denominator = this.denominator * other.denominator;
        int numerator = this.numerator * other.numerator;

        return new FractionImpl(numerator, denominator);
    }

    /**
     * @inheritDoc
     */
    @Override
    public Fraction divide(Fraction f) {
        FractionImpl other = (FractionImpl) f;

        int numerator = this.numerator * other.denominator;
        int denominator = this.denominator * other.numerator;

        return new FractionImpl(numerator, denominator);
    }

    /**
     * @inheritDoc
     */
    public FractionImpl abs() {

        FractionImpl newFraction = new FractionImpl(this.numerator, this.denominator);

        if(this.numerator < 0){

            int numerator = this.numerator * -1;
            newFraction = new FractionImpl(numerator, this.denominator);
        }

        return newFraction;

    }

    /**
     * @inheritDoc
     */
    @Override
    public Fraction negate() {

        int numerator = this.numerator;
        numerator *= -1;
        return new FractionImpl(numerator, this.denominator);
    }

    /**
     * @inheritDoc
     */
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    /**
     * @inheritDoc
     */
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Fraction){
            return super.equals(obj);
        }
       else {
            return false;
        }
    }

    /**
     * @inheritDoc
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {

        return super.clone();
    }

    /**
     * @inheritDoc
     */
    @Override
    public Fraction inverse() {

        int numerator = this.denominator;
        int denominator = this.numerator;

        return new FractionImpl(numerator, denominator);
    }

    /**
     * @inheritDoc
     */
    @Override
    public int compareTo(Fraction o) {

        //convert numerators and denominators to float and compare division value

        FractionImpl other = (FractionImpl) o;
        float thisDivision = (float) this.numerator / (float) this.denominator;
        float otherDivision = (float) other.numerator / (float) other.denominator;

        if (thisDivision == 0){
            return 0;
        }if (thisDivision > otherDivision){
            return 1;
        }else {
            return -1;
        }

    }

    /**
     * @inheritDoc
     */
    @Override
    public String toString() {

            return this.numerator + "/" + this.denominator;
    }
}
