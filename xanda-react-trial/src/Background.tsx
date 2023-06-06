import "./css/background.css"
import hero from "../public/assets/hero.jpg"
import logo from "../public/assets/logo.png"

function Background() {
    return (
        <div className="background">
            <div className="upper">
            <img src={logo} className="logo" />
            <img src={hero} className="hero"  />
            </div>
            <div className="half" />
        </div>)}

export default Background