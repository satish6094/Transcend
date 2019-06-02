package com.cloudproco.transcend.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QParty is a Querydsl query type for Party
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QParty extends EntityPathBase<Party> {

    private static final long serialVersionUID = 533347655L;

    public static final QParty party = new QParty("party");

    public final StringPath addressLine1 = createString("addressLine1");

    public final StringPath addressLine2 = createString("addressLine2");

    public final StringPath addressLine3 = createString("addressLine3");

    public final StringPath city = createString("city");

    public final StringPath companyName = createString("companyName");

    public final StringPath country2 = createString("country2");

    public final DateTimePath<java.sql.Timestamp> createdDate = createDateTime("createdDate", java.sql.Timestamp.class);

    public final StringPath firstName = createString("firstName");

    public final StringPath lastName = createString("lastName");

    public final StringPath listSource = createString("listSource");

    public final DateTimePath<java.sql.Timestamp> modifiedDate = createDateTime("modifiedDate", java.sql.Timestamp.class);

    public final NumberPath<Long> partyId = createNumber("partyId", Long.class);

    public final StringPath postalCode = createString("postalCode");

    public final StringPath state = createString("state");

    public QParty(String variable) {
        super(Party.class, forVariable(variable));
    }

    public QParty(Path<? extends Party> path) {
        super(path.getType(), path.getMetadata());
    }

    public QParty(PathMetadata metadata) {
        super(Party.class, metadata);
    }

}

