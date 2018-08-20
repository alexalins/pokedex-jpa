package entity;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Lob;

/**
 *
 * @author alexalins
 */
@Entity
public class Pokemon implements Serializable {

    @Id
    private int id;
    @Column(length = 25)
    private String nome;
    @Enumerated(EnumType.STRING)
    private Tipo tipo;
    private int ataque;
    private int defesa;
    private int hp;
    private String evolucao;
    @Lob
    private String foto;

    public Pokemon() {
    }

    public Pokemon(int id, String nome, Tipo tipo, int ataque, int defesa, int hp, String evolucao, String foto) {
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
        this.ataque = ataque;
        this.defesa = defesa;
        this.hp = hp;
        this.evolucao = evolucao;
        this.foto = foto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getEvolucao() {
        return evolucao;
    }

    public void setEvolucao(String evolucao) {
        this.evolucao = evolucao;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.id;
        hash = 97 * hash + Objects.hashCode(this.nome);
        hash = 97 * hash + Objects.hashCode(this.tipo);
        hash = 97 * hash + this.ataque;
        hash = 97 * hash + this.defesa;
        hash = 97 * hash + this.hp;
        hash = 97 * hash + Objects.hashCode(this.evolucao);
        hash = 97 * hash + Objects.hashCode(this.foto);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pokemon other = (Pokemon) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.ataque != other.ataque) {
            return false;
        }
        if (this.defesa != other.defesa) {
            return false;
        }
        if (this.hp != other.hp) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.evolucao, other.evolucao)) {
            return false;
        }
        if (!Objects.equals(this.foto, other.foto)) {
            return false;
        }
        if (this.tipo != other.tipo) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Pokemon{" + "id=" + id + ", nome=" + nome + ", tipo=" + tipo + ", ataque=" + ataque + ", defesa=" + defesa + ", hp=" + hp + ", evolucao=" + evolucao + ", foto=" + foto + '}';
    }

}
