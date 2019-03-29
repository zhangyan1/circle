
package com.sodanights.circle.client.common.domain;

import java.io.Serializable;

import org.apache.commons.lang.builder.CompareToBuilder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;





/**
 * Created by zhangyan on 27/03/2018.
 */
public class Domain  implements Serializable, Cloneable, Comparable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1093611608004530526L;
	
	
	public String toString() {
        return ToStringBuilder.reflectionToString(this,
                ToStringStyle.SHORT_PREFIX_STYLE);
    }

    public boolean equals(Object o) {
        return EqualsBuilder.reflectionEquals(this, o);
    }
    
    public int hashCode() {
    	return HashCodeBuilder.reflectionHashCode(this);
    }
    
    public int compareTo(Object o) {
        return CompareToBuilder.reflectionCompare(this, o);
    }
}
