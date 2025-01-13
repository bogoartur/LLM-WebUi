import logoLLaVA from "./main/resources/static/icons/llava.png";
import logoMS from "./main/resources/static/icons/ms.jpeg";
import logoLlama from "./main/resources/static/icons/llama.webp";
import Conversa from "./Conversa.jsx";
import Sidebar from "./Sidebar.jsx";
import "./index.css";
function Container() {
  return (
    <div className="container">
      <Sidebar />
      <Conversa />
    </div>
  );
}

export default Container;
