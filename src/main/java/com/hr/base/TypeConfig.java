package com.hr.base;

import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.internal.types.JavaTypeResolverDefaultImpl;

import java.sql.Types;

/**
 * Created by huangrui on 2018/6/5.
 */
public class TypeConfig extends JavaTypeResolverDefaultImpl {

    /**
     * <javaTypeResolver type="${base.typeResolver}">
     <property name="forceBigDecimals" value="false"/>
     </javaTypeResolver>
     */

    public TypeConfig() {
        super();
        //数据库的 tiny映射到java 会变成Byte类型，这里覆写父类，改成Integer
        super.typeMap.put(Types.TINYINT, new JdbcTypeInformation("TINYINT", //$NON-NLS-1$
                new FullyQualifiedJavaType(Integer.class.getName())));
        super.typeMap.put(Types.SMALLINT, new JdbcTypeInformation("SMALLINT", //$NON-NLS-1$
                new FullyQualifiedJavaType(Integer.class.getName())));
    }
}
