import "./css/nav.css"
import telephone from "../public/assets/telephone.png"
import flag from "../public/assets/flag.png"


function Nav() {
    return (
        <div className="nav">
            <li className='nav-item'><img src={telephone} /><label>1337 1337 1337</label></li>
            <li className='nav-item'><img src={flag} /><label>Try another Castle</label></li>

        </div>)}

export default Nav