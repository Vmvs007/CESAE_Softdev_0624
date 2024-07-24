package PequenaPizzaria.Ingredientes;

import PequenaPizzaria.Enums.OrigemIngrediente;
import PequenaPizzaria.Enums.TipoFrutoMar;
import PequenaPizzaria.Enums.UnidadeMedida;

public class FrutoMar extends Topping{

    private TipoFrutoMar tipo;

    public FrutoMar(int id, String nome, UnidadeMedida unidadeMedida, double calorias, OrigemIngrediente origem, TipoFrutoMar tipo) {
        super(id, nome, unidadeMedida, calorias, origem);
        this.tipo = tipo;
    }
}
