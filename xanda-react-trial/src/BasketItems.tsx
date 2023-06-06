import TotalItems from"./TotalItems"
import React, { createContext, useState, useContext } from "react";
import "./css/card.css"
import "./css/basketItems.css"

import { SelectedContext } from "./context/SelectedContext";
import bin from "../public/assets/bin.png"
import coins from "../public/assets/coins.png"

function BasketItems({item}){
    const {selected, setSelected} = useContext(SelectedContext)
    const {id, image, title, price} = item
    const handleRemove = () =>{
        setSelected(selected.filter((item: { id: any; }) => item.id !== id))
    }
    return(
        <div className="basket-item">
            <img className='selected-card-image' src={image} />
            <div className="selected-card-details">
            <p className="title">{title}</p>
            <div className="price">
                <img className="coins" src={coins}/><label>{price} Gli</label></div>
            </div>
            <img className="bin" onClick={handleRemove} src={bin} />
        </div>
    )
}

export default BasketItems;