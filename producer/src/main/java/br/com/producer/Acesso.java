package br.com.producer;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Acesso {

    private Long id;

    private Long portaId;

    private Long clienteId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPortaId() {
        return portaId;
    }

    public void setPortaId(Long portaId) {
        this.portaId = portaId;
    }

    public Long getClienteId() {
        return clienteId;
    }

    public void setClienteId(Long clienteId) {
        this.clienteId = clienteId;
    }
}
