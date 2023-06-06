import "./css/basket.css"
import BasketItems from"./BasketItems"
import TotalItems from"./TotalItems"
import Checkout from "./Checkout"

import React, { createContext, useState, useContext } from "react";
import "./css/card.css"
import { SelectedContext } from "./context/SelectedContext";


function Basket (){
    const {cont, setCont} = useContext(SelectedContext)
    const {selected, setSelected} = useContext(SelectedContext)
    const disableButton = selected.length === 0 
   
    return(<div className="basket">

        <h1>Basket</h1>
        {selected.length === 0 ?
        <div className="side">
        <p className="empty-basket">No items </p>
        </div>:
        <div className={cont ? "continued" : "side"}>
            <div>
        { selected.map( (item: any) => 
        <BasketItems item={item} /> 
        )}
        </div>
        <TotalItems />
        </div>}
        <button className={disableButton ? "disabled-btn": "continue-btn"} onChange={()=>disableButton} onClick={()=> setCont(true)}>Continue</button>

    </div>)
}

export default Basket




