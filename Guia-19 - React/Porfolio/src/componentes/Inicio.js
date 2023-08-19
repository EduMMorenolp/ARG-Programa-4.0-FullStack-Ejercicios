import { useState } from "react";
import React from "react";
import {
  Container,
  Row,
  Col,
  ProgressBar,
  Tab,
  Tabs,
  Modal,
  Button,
} from "react-bootstrap";

export function Inicio() {
  const [show, setShow] = useState(false);

  const handleClose = () => setShow(false);
  const handleShow = () => setShow(true);
  return (
    <>
      <Button variant="primary" onClick={handleShow}>
        Mostrar Modal
      </Button>

      <Modal show={show} onHide={handleClose}>
        <Modal.Header closeButton>
          <Modal.Title>Título del Modal</Modal.Title>
        </Modal.Header>
        <Modal.Body>Contenido del Modal</Modal.Body>
        <Modal.Footer>
          <Button variant="secondary" onClick={handleClose}>
            Cerrar
          </Button>
          <Button variant="primary" onClick={handleClose}>
            Guardar cambios
          </Button>
        </Modal.Footer>
      </Modal>
    </>
  );
}

export function MyProgressBar() {
  return <ProgressBar now={60} label={`${60}%`} />;
}

export default Inicio;
