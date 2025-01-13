function ModeloId({ nome, logo }) {
  return (
    <article className="previaconversa">
      <img className="sideicon" src={logo} alt="" />
      <h3 className="nome">{nome}</h3>
    </article>
  );
}

export default ModeloId;
