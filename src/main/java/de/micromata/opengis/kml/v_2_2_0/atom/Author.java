
package de.micromata.opengis.kml.v_2_2_0.atom;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <atom:author>
 * <p>
 * KML 2.2 supports new elements for including data about the author and related website 
 * in your KML file. This information is displayed in geo search results, both in Earth 
 * browsers such as Google Earth, and in other applications such as Google Maps. The 
 * ascription elements used in KML are as follows: 
 * </p>
 * <p>
 * These elements are defined in the Atom Syndication Format. The complete specification 
 * is found at http://atompub.org. (see the sample that follows). 
 * </p>
 * <p>
 * These elements are defined in the Atom Syndication Format. The complete specification 
 * is found at http://atompub.org. (see the sample that follows). 
 * </p>
 * <p>
 * The <atom:author> element is the parent element for <atom:name>, which specifies 
 * the author of the KML feature. 
 * </p>
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "nameOrUriOrEmail"
})
@XmlRootElement(name = "author")
public class Author {

    protected List<String> nameOrUriOrEmail;

    public Author() {
        super();
    }

    /**
     * 
     */
    public List<String> getNameOrUriOrEmail() {
        if (nameOrUriOrEmail == null) {
            nameOrUriOrEmail = new ArrayList<String>();
        }
        return this.nameOrUriOrEmail;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = ((prime*result)+((nameOrUriOrEmail == null)? 0 :nameOrUriOrEmail.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if ((obj instanceof Author) == false) {
            return false;
        }
        Author other = ((Author) obj);
        if (nameOrUriOrEmail == null) {
            if (other.nameOrUriOrEmail!= null) {
                return false;
            }
        } else {
            if (nameOrUriOrEmail.equals(other.nameOrUriOrEmail) == false) {
                return false;
            }
        }
        return true;
    }

    /**
     * Sets the value of the nameOrUriOrEmail property Objects of the following type(s) are allowed in the list List<String>.
     * <p>Note:
     * <p>This method does not make use of the fluent pattern.If you would like to make it fluent, use {@link #withNameOrUriOrEmail} instead.
     * 
     * 
     * @param nameOrUriOrEmail
     */
    public void setNameOrUriOrEmail(final List<String> nameOrUriOrEmail) {
        this.nameOrUriOrEmail = nameOrUriOrEmail;
    }

    /**
     * add a value to the nameOrUriOrEmail property collection
     * 
     * @param nameOrUriOrEmail
     *     Objects of the following type are allowed in the list: {@code <}{@link String}{@code>}{@link JAXBElement}{@code <}{@link String}{@code>}{@link JAXBElement}{@code <}{@link String}{@code>}
     * @return
     *     <tt>true</tt> (as general contract of <tt>Collection.add</tt>). 
     */
    public Author addToNameOrUriOrEmail(final String nameOrUriOrEmail) {
        this.getNameOrUriOrEmail().add(nameOrUriOrEmail);
        return this;
    }

    /**
     * fluent setter
     * 
     * @param nameOrUriOrEmail
     *     required parameter
     */
    public Author withNameOrUriOrEmail(final List<String> nameOrUriOrEmail) {
        this.setNameOrUriOrEmail(nameOrUriOrEmail);
        return this;
    }

}