// Academico: Rodrigo Estevão Rottava RA: 60001962
// Classe Principal
//=============================================================================================================


package atividadem;

import atividade.model.Veiculo;
import atividade.view.VeiculoView;
import atividade.controller.VeiculoController;

public class AtividadeMain {
    
    public static void main(String[] args) {
        
    Veiculo model = new Veiculo("", "", 0);
    VeiculoView view = new VeiculoView();
    VeiculoController controller = new VeiculoController(model, view);

    controller.cadastrarVeiculo();
    controller.mostrarVeiculo();
    
    }
}

