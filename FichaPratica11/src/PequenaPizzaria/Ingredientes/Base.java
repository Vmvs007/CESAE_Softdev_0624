package PequenaPizzaria.Ingredientes;

import PequenaPizzaria.Enums.TipoBase;
import PequenaPizzaria.Enums.UnidadeMedida;

public class Base extends Ingrediente{
    private TipoBase tipoBase;
    private String descricao;

    /**
     * Método construtor para <b>Base</b>
     * @param id id da <b>Base</b>
     * @param nome Nome da <b>Base</b>
     * @param calorias Calorias/Grama da <b>Base</b>
     * @param tipoBase Tipo da <b>Base</b>
     * @param descricao Descrição da <b>Base</b>
     */
    public Base(int id, String nome, double calorias, TipoBase tipoBase, String descricao) {
        super(id, nome, UnidadeMedida.GRAMAS, calorias);
        this.tipoBase = tipoBase;
        this.descricao = descricao;
    }
}
