import { createContext, useState } from "react";
export const SelectedContext = createContext();

export const SelectedProvider = ({children})=>{
    
    const [cont, setCont] = useState(false)

  const [selected, setSelected] = useState([]);
  
    return(
        <SelectedContext.Provider value={{selected, setSelected, cont, setCont}}>
        {children}
        </SelectedContext.Provider>
    )
}