package dao;

import entity.Pokemon;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 *
 * @author alexalins
 */
@Stateless
public class PokemonDao implements InterfaceDao {

    private final EntityManager entityManager;

    public PokemonDao() {
        this.entityManager = Persistence.createEntityManagerFactory("pokemon-jpa").createEntityManager();
    }

    public PokemonDao(String persistenceUnitName) {
        this.entityManager = Persistence.createEntityManagerFactory(persistenceUnitName).createEntityManager();
    }

    @Override
    public void salvar(Pokemon pokemon) {
        entityManager.getTransaction().begin();
        entityManager.persist(pokemon);
        entityManager.getTransaction().commit();
    }

    @Override
    public void remover(Pokemon pokemon) {
        entityManager.getTransaction().begin();
        entityManager.remove(pokemon);
        entityManager.getTransaction().commit();
    }

    @Override
    public void editar(Pokemon pokemon) {
        entityManager.getTransaction().begin();
        entityManager.merge(pokemon);
        entityManager.getTransaction().commit();
    }

    @Override
    public Pokemon buscar(Pokemon pokemon) {
        return entityManager.find(Pokemon.class, pokemon.getId());
    }

    @Override
    public List<Pokemon> listarTodos() {
        List<Pokemon> pokemons;
        entityManager.getTransaction().begin();
        pokemons = entityManager.createQuery("SELECT p FROM Pokemon p").getResultList();
        entityManager.getTransaction().commit();

        return pokemons;
    }

    @Override
    public List<Pokemon> listarPorId(int id) {
        List<Pokemon> pokemons;
        entityManager.getTransaction().begin();
        pokemons = entityManager.createQuery("SELECT p FROM Pokemon p ORDEM BY id").getResultList();
        entityManager.getTransaction().commit();

        return pokemons;
    }

    @Override
    public List<Pokemon> listarPorNome(String nome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Pokemon> listarPorInicial(String inicial) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Pokemon> listarPorAtaque(int ataque) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Pokemon> listarPorDefesa(int defesa) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Pokemon> listarPorHp(int hp) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
