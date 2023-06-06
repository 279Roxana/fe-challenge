import React from "react";
import ReactDOM from "react-dom/client";
import App from "./App";
import SelectedContext, { SelectedProvider } from "../src/context/SelectedContext";

ReactDOM.createRoot(document.getElementById("root") as HTMLElement).render(
    <React.StrictMode>
        <SelectedProvider>
        <App />
        </SelectedProvider>
    </React.StrictMode>
);
