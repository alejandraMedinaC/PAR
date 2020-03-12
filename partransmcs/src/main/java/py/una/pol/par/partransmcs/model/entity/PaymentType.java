package py.una.pol.par.partransmcs.model.entity;

import py.una.pol.par.commons.entity.BaseEntity;

public class PaymentType extends BaseEntity<Object>{

    public PaymentType() {
        super(0,"");
    }

    public PaymentType(Integer id_forma_pago, String descripcion) {
        super(id_forma_pago, descripcion);
    }
    
}
