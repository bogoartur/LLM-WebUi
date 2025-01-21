import logoLLaVA from "./main/resources/static/icons/llava.png";
import logoMS from "./main/resources/static/icons/ms.jpeg";
import logoLlama from "./main/resources/static/icons/llama.webp";
import CampoInput from "./CampoInput.jsx";
import React, { useState, useEffect } from "react";

function Conversa() {
  const [mensagens, setMensagens] = useState([]);

  useEffect(() => {
    fetch("http://localhost:8080/api/mensagem") //isso é um get
      .then((response) => response.json())
      .then((data) => setMensagens(data))
      .catch((error) => console.log(error));
  }, []);

  return (
    <div className="conversa">
      <div className="topbar">
        <h2>LLaVA</h2>
      </div>
      {mensagens.map((mensagem, index) => (
        <div
          className={mensagem.remetente === true ? "linha usuario" : "linha"}
          key={index}
        >
          <div
            className={mensagem.remetente === true ? "bolha usuario" : "bolha"}
          >
            <p>{mensagem.conteudo}</p>
          </div>
        </div>
      ))}
      <CampoInput />
    </div>
  );
}

export default Conversa;
