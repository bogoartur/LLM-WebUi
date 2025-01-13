import logoLLaVA from "./main/resources/static/icons/llava.png";
import logoMS from "./main/resources/static/icons/ms.jpeg";
import logoLlama from "./main/resources/static/icons/llama.webp";
import Modelos from "./Modelos.jsx";
import "./index.css";
function Sidebar() {
  return (
    <div className="sidebar">
      <section>
        <div className="topbar">
          <h2 className="tituloprojeto">LLM WebUi</h2>
        </div>
      </section>
      <section className="content">
        <div className="titulo">
          <div className="title">
            <h2>Modelos</h2>
          </div>

          <div className="botaoadd">
            <button type="button" className="btn">
              +
            </button>
          </div>
        </div>
        <Modelos />
      </section>
    </div>
  );
}

export default Sidebar;
