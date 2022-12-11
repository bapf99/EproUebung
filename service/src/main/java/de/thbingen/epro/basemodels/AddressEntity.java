package de.thbingen.epro.basemodels;

import javax.persistence.*;


/**
 * @author epro
 *
 */
@MappedSuperclass
public class AddressEntity {

    @Id
    @SequenceGenerator(name = "seqGenerator", sequenceName = "DICTIONARY_SEQ_1")
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
