// Academico: Rodrigo Estevão Rottava RA: 60001962
// Controller
//=============================================================================================================


package atividade.controller;

import atividade.model.Veiculo;
import atividade.view.VeiculoView;

public class VeiculoController {
    
private Veiculo model;
private VeiculoView view;

    public VeiculoController(Veiculo model, VeiculoView view) {
    this.model = model;
    this.view = view;
    }

    public void cadastrarVeiculo() {
    String marca = view.obterMarca();
    String modelo = view.obterModelo();
    int ano = view.obterAno();

    model.setMarca(marca);
    model.setModelo(modelo);
    model.setAno(ano);
    }

    public void mostrarVeiculo() {
    view.exibirVeiculo(model.getMarca(), model.getModelo(), model.getAno());
    
    }
}

