package de.thbingen.epro.basemodels;

import javax.persistence.*;


/**
 * @author epro
 *
 */
@MappedSuperclass
public class AbstractEntity {

    @Id
    @SequenceGenerator(name = "seqGenerator", sequenceName = "DICTIONARY_SEQ")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqGenerator")
    private Long id;

    /**
     *
     * Returns the identifier of the entity
     *
     * @return the id
     */
    public Long getId(){
        return id;
    }

}
