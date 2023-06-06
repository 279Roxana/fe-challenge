import React, { createContext, useState, useContext } from "react";
import "./css/card.css"
import { SelectedContext } from "./context/SelectedContext";
import coins from "../public/assets/coins.png"
import controller from"../public/assets/controller.png"
function Card ({data}){
    const {id, title, description, image, price} = data
    const {selected, setSelected} = useContext(SelectedContext)
    const handleCart = () =>{
        return setSelected([...selected, data])
    }

    const cardSelected = selected.find((card: { id: any; }) => card.id === id)
    const cardClass = cardSelected ?
        "card selected-card" : "card"

    
    return(
        <div className={cardClass} key={id}>
            <img src={image} />
            <div className="details">
            <h2 className="title">{title}</h2>
            <p className="description">{description}</p>
            <div className="price">
                <img className="coins" src={coins}/><label>{price} Gli</label></div>
            <div className="card-footer">
                <button className="add-to-cart" onClick={handleCart} disabled={cardSelected} >Add to cart</button>
                <img className="controller" src={controller} />

                </div>
            </div>
        </div>
    )
    }

export default Card;
