package epicode.entities;

import javax.persistence.Entity;
import java.time.LocalDate;

@Entity
public class Concerto extends Event{
Genere genere;
InStreaming inStreaming;

    public Concerto() {}

    public Concerto(String titolo, LocalDate dataEvento, String descrizione, TipoEvento tipoEvento, int numeroMassimoPartecipanti, Location location) {
        super(titolo, dataEvento, descrizione, tipoEvento, numeroMassimoPartecipanti, location);
    }

    public Genere getGenere() {
        return genere;
    }

    public void setGenere(Genere genere) {
        this.genere = genere;
    }

    public InStreaming getInStreaming() {
        return inStreaming;
    }

    public void setInStreaming(InStreaming inStreaming) {
        this.inStreaming = inStreaming;
    }
}
