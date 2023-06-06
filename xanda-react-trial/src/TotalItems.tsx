import React, { createContext, useState, useContext } from "react";
import "./css/card.css"
import { SelectedContext } from "./context/SelectedContext";

function TotalItems(){
    const {selected, setSelected} = useContext(SelectedContext)

    const total = selected.map((item: { price: any; }) => item.price).reduce((a:any,b:any)=>a+b, 0)
    return(
        <div className="total">
        <p className="total-tag">Total </p> <p className="ammount">{total} Gil</p>
        </div>
    )
}

export default TotalItems;


