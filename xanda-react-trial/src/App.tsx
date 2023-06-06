// import "./sass/app.scss";
import React, { createContext, useState, useContext } from "react";
import Background from "./Background";
import Nav from "./Nav";
import Card from "./Card";
import Checkout from "./Checkout";

import Basket from "./Basket";
import "./css/nav.css"
import "./css/app.css"

import {productData} from "./productData";
import { SelectedContext } from "./context/SelectedContext";

function App() {
    const {cont, setCont} = useContext(SelectedContext)

    const {selected, setSelected} = useContext(SelectedContext)

    return (
        <div className="App">
            <div className="left-components">
            <Nav />
           <Background />
           {!cont &&
           <div className="cards">
           {productData.map((data: any) => <Card data={data} />)}

           </div>}
           {cont && <Checkout />}
           </div>
           {!cont && <Basket />}

        </div>
    );
}

export default App;
