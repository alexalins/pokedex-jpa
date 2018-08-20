package dao;

import entity.Pokemon;
import java.util.List;

/**
 *
 * @author alexalins
 */
public interface InterfaceDao {
    void salvar(Pokemon pokemon);
    void remover(Pokemon pokemon);
    void editar(Pokemon pokemon);
    Pokemon buscar(Pokemon pokemon);
    List<Pokemon> listarTodos();
    List<Pokemon> listarPorId(int id);
    List<Pokemon> listarPorNome(String nome);
    List<Pokemon> listarPorInicial(String inicial);
    List<Pokemon> listarPorAtaque(int ataque);
    List<Pokemon> listarPorDefesa(int defesa);
    List<Pokemon> listarPorHp(int hp);
}
