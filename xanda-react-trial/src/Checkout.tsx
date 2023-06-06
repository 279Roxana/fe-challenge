import { SelectedContext } from "./context/SelectedContext";
import React, { createContext, useState, useContext } from "react";
import "./css/checkout.css"
import BasketItems from "./BasketItems";
import TotalItems from "./TotalItems";

function Checkout(){
    const {cont, setCont} = useContext(SelectedContext)
    const {selected, setSelected} = useContext(SelectedContext)

    return(
        <div className="checkout">
             <button className="go-back-btn" onClick={()=> setCont(false)}>Go Back</button>
            <div className="content">
           {selected.map((item: any) => <BasketItems item={item} />)}
           <div className="total">
            <TotalItems />
            </div>
            </div>
        </div>
    )
}

export default Checkout