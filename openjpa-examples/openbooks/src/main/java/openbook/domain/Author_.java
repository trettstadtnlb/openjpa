/** 
 *  Generated by OpenJPA MetaModel Generator Tool.
**/

package openbook.domain;

import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;

@javax.persistence.metamodel.StaticMetamodel
(value=openbook.domain.Author.class)
@javax.annotation.Generated
(value="org.apache.openjpa.persistence.meta.AnnotationProcessor6",date="Thu May 13 20:18:23 CDT 2010")
public class Author_ {
    public static volatile SetAttribute<Author,Book> books;
    public static volatile SingularAttribute<Author,Long> id;
    public static volatile SingularAttribute<Author,String> name;
    public static volatile SingularAttribute<Author,Integer> version;
}
