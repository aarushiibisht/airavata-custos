/**
 * Autogenerated by Thrift Compiler (0.12.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.custos.profile.model.user;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
/**
 * A structure holding the NSF Demographic information.
 * 
 * 
 */
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.12.0)", date = "2019-08-12")
public class NSFDemographics implements org.apache.thrift.TBase<NSFDemographics, NSFDemographics._Fields>, java.io.Serializable, Cloneable, Comparable<NSFDemographics> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("NSFDemographics");

  private static final org.apache.thrift.protocol.TField CUSTOS_INTERNAL_USER_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("custosInternalUserId", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField GENDER_FIELD_DESC = new org.apache.thrift.protocol.TField("gender", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField US_CITIZENSHIP_FIELD_DESC = new org.apache.thrift.protocol.TField("usCitizenship", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField ETHNICITIES_FIELD_DESC = new org.apache.thrift.protocol.TField("ethnicities", org.apache.thrift.protocol.TType.LIST, (short)4);
  private static final org.apache.thrift.protocol.TField RACES_FIELD_DESC = new org.apache.thrift.protocol.TField("races", org.apache.thrift.protocol.TType.LIST, (short)5);
  private static final org.apache.thrift.protocol.TField DISABILITIES_FIELD_DESC = new org.apache.thrift.protocol.TField("disabilities", org.apache.thrift.protocol.TType.LIST, (short)6);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new NSFDemographicsStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new NSFDemographicsTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable String custosInternalUserId; // required
  public @org.apache.thrift.annotation.Nullable String gender; // optional
  /**
   * 
   * @see USCitizenship
   */
  public @org.apache.thrift.annotation.Nullable USCitizenship usCitizenship; // optional
  public @org.apache.thrift.annotation.Nullable java.util.List<ethnicity> ethnicities; // optional
  public @org.apache.thrift.annotation.Nullable java.util.List<race> races; // optional
  public @org.apache.thrift.annotation.Nullable java.util.List<disability> disabilities; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    CUSTOS_INTERNAL_USER_ID((short)1, "custosInternalUserId"),
    GENDER((short)2, "gender"),
    /**
     * 
     * @see USCitizenship
     */
    US_CITIZENSHIP((short)3, "usCitizenship"),
    ETHNICITIES((short)4, "ethnicities"),
    RACES((short)5, "races"),
    DISABILITIES((short)6, "disabilities");

    private static final java.util.Map<String, _Fields> byName = new java.util.HashMap<String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // CUSTOS_INTERNAL_USER_ID
          return CUSTOS_INTERNAL_USER_ID;
        case 2: // GENDER
          return GENDER;
        case 3: // US_CITIZENSHIP
          return US_CITIZENSHIP;
        case 4: // ETHNICITIES
          return ETHNICITIES;
        case 5: // RACES
          return RACES;
        case 6: // DISABILITIES
          return DISABILITIES;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final _Fields optionals[] = {_Fields.GENDER,_Fields.US_CITIZENSHIP,_Fields.ETHNICITIES,_Fields.RACES,_Fields.DISABILITIES};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.CUSTOS_INTERNAL_USER_ID, new org.apache.thrift.meta_data.FieldMetaData("custosInternalUserId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.GENDER, new org.apache.thrift.meta_data.FieldMetaData("gender", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.US_CITIZENSHIP, new org.apache.thrift.meta_data.FieldMetaData("usCitizenship", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, USCitizenship.class)));
    tmpMap.put(_Fields.ETHNICITIES, new org.apache.thrift.meta_data.FieldMetaData("ethnicities", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, ethnicity.class))));
    tmpMap.put(_Fields.RACES, new org.apache.thrift.meta_data.FieldMetaData("races", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, race.class))));
    tmpMap.put(_Fields.DISABILITIES, new org.apache.thrift.meta_data.FieldMetaData("disabilities", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, disability.class))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(NSFDemographics.class, metaDataMap);
  }

  public NSFDemographics() {
    this.custosInternalUserId = "DO_NOT_SET_AT_CLIENTS";

  }

  public NSFDemographics(
    String custosInternalUserId)
  {
    this();
    this.custosInternalUserId = custosInternalUserId;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public NSFDemographics(NSFDemographics other) {
    if (other.isSetCustosInternalUserId()) {
      this.custosInternalUserId = other.custosInternalUserId;
    }
    if (other.isSetGender()) {
      this.gender = other.gender;
    }
    if (other.isSetUsCitizenship()) {
      this.usCitizenship = other.usCitizenship;
    }
    if (other.isSetEthnicities()) {
      java.util.List<ethnicity> __this__ethnicities = new java.util.ArrayList<ethnicity>(other.ethnicities.size());
      for (ethnicity other_element : other.ethnicities) {
        __this__ethnicities.add(other_element);
      }
      this.ethnicities = __this__ethnicities;
    }
    if (other.isSetRaces()) {
      java.util.List<race> __this__races = new java.util.ArrayList<race>(other.races.size());
      for (race other_element : other.races) {
        __this__races.add(other_element);
      }
      this.races = __this__races;
    }
    if (other.isSetDisabilities()) {
      java.util.List<disability> __this__disabilities = new java.util.ArrayList<disability>(other.disabilities.size());
      for (disability other_element : other.disabilities) {
        __this__disabilities.add(other_element);
      }
      this.disabilities = __this__disabilities;
    }
  }

  public NSFDemographics deepCopy() {
    return new NSFDemographics(this);
  }

  @Override
  public void clear() {
    this.custosInternalUserId = "DO_NOT_SET_AT_CLIENTS";

    this.gender = null;
    this.usCitizenship = null;
    this.ethnicities = null;
    this.races = null;
    this.disabilities = null;
  }

  @org.apache.thrift.annotation.Nullable
  public String getCustosInternalUserId() {
    return this.custosInternalUserId;
  }

  public NSFDemographics setCustosInternalUserId(@org.apache.thrift.annotation.Nullable String custosInternalUserId) {
    this.custosInternalUserId = custosInternalUserId;
    return this;
  }

  public void unsetCustosInternalUserId() {
    this.custosInternalUserId = null;
  }

  /** Returns true if field custosInternalUserId is set (has been assigned a value) and false otherwise */
  public boolean isSetCustosInternalUserId() {
    return this.custosInternalUserId != null;
  }

  public void setCustosInternalUserIdIsSet(boolean value) {
    if (!value) {
      this.custosInternalUserId = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public String getGender() {
    return this.gender;
  }

  public NSFDemographics setGender(@org.apache.thrift.annotation.Nullable String gender) {
    this.gender = gender;
    return this;
  }

  public void unsetGender() {
    this.gender = null;
  }

  /** Returns true if field gender is set (has been assigned a value) and false otherwise */
  public boolean isSetGender() {
    return this.gender != null;
  }

  public void setGenderIsSet(boolean value) {
    if (!value) {
      this.gender = null;
    }
  }

  /**
   * 
   * @see USCitizenship
   */
  @org.apache.thrift.annotation.Nullable
  public USCitizenship getUsCitizenship() {
    return this.usCitizenship;
  }

  /**
   * 
   * @see USCitizenship
   */
  public NSFDemographics setUsCitizenship(@org.apache.thrift.annotation.Nullable USCitizenship usCitizenship) {
    this.usCitizenship = usCitizenship;
    return this;
  }

  public void unsetUsCitizenship() {
    this.usCitizenship = null;
  }

  /** Returns true if field usCitizenship is set (has been assigned a value) and false otherwise */
  public boolean isSetUsCitizenship() {
    return this.usCitizenship != null;
  }

  public void setUsCitizenshipIsSet(boolean value) {
    if (!value) {
      this.usCitizenship = null;
    }
  }

  public int getEthnicitiesSize() {
    return (this.ethnicities == null) ? 0 : this.ethnicities.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<ethnicity> getEthnicitiesIterator() {
    return (this.ethnicities == null) ? null : this.ethnicities.iterator();
  }

  public void addToEthnicities(ethnicity elem) {
    if (this.ethnicities == null) {
      this.ethnicities = new java.util.ArrayList<ethnicity>();
    }
    this.ethnicities.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<ethnicity> getEthnicities() {
    return this.ethnicities;
  }

  public NSFDemographics setEthnicities(@org.apache.thrift.annotation.Nullable java.util.List<ethnicity> ethnicities) {
    this.ethnicities = ethnicities;
    return this;
  }

  public void unsetEthnicities() {
    this.ethnicities = null;
  }

  /** Returns true if field ethnicities is set (has been assigned a value) and false otherwise */
  public boolean isSetEthnicities() {
    return this.ethnicities != null;
  }

  public void setEthnicitiesIsSet(boolean value) {
    if (!value) {
      this.ethnicities = null;
    }
  }

  public int getRacesSize() {
    return (this.races == null) ? 0 : this.races.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<race> getRacesIterator() {
    return (this.races == null) ? null : this.races.iterator();
  }

  public void addToRaces(race elem) {
    if (this.races == null) {
      this.races = new java.util.ArrayList<race>();
    }
    this.races.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<race> getRaces() {
    return this.races;
  }

  public NSFDemographics setRaces(@org.apache.thrift.annotation.Nullable java.util.List<race> races) {
    this.races = races;
    return this;
  }

  public void unsetRaces() {
    this.races = null;
  }

  /** Returns true if field races is set (has been assigned a value) and false otherwise */
  public boolean isSetRaces() {
    return this.races != null;
  }

  public void setRacesIsSet(boolean value) {
    if (!value) {
      this.races = null;
    }
  }

  public int getDisabilitiesSize() {
    return (this.disabilities == null) ? 0 : this.disabilities.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<disability> getDisabilitiesIterator() {
    return (this.disabilities == null) ? null : this.disabilities.iterator();
  }

  public void addToDisabilities(disability elem) {
    if (this.disabilities == null) {
      this.disabilities = new java.util.ArrayList<disability>();
    }
    this.disabilities.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<disability> getDisabilities() {
    return this.disabilities;
  }

  public NSFDemographics setDisabilities(@org.apache.thrift.annotation.Nullable java.util.List<disability> disabilities) {
    this.disabilities = disabilities;
    return this;
  }

  public void unsetDisabilities() {
    this.disabilities = null;
  }

  /** Returns true if field disabilities is set (has been assigned a value) and false otherwise */
  public boolean isSetDisabilities() {
    return this.disabilities != null;
  }

  public void setDisabilitiesIsSet(boolean value) {
    if (!value) {
      this.disabilities = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable Object value) {
    switch (field) {
    case CUSTOS_INTERNAL_USER_ID:
      if (value == null) {
        unsetCustosInternalUserId();
      } else {
        setCustosInternalUserId((String)value);
      }
      break;

    case GENDER:
      if (value == null) {
        unsetGender();
      } else {
        setGender((String)value);
      }
      break;

    case US_CITIZENSHIP:
      if (value == null) {
        unsetUsCitizenship();
      } else {
        setUsCitizenship((USCitizenship)value);
      }
      break;

    case ETHNICITIES:
      if (value == null) {
        unsetEthnicities();
      } else {
        setEthnicities((java.util.List<ethnicity>)value);
      }
      break;

    case RACES:
      if (value == null) {
        unsetRaces();
      } else {
        setRaces((java.util.List<race>)value);
      }
      break;

    case DISABILITIES:
      if (value == null) {
        unsetDisabilities();
      } else {
        setDisabilities((java.util.List<disability>)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public Object getFieldValue(_Fields field) {
    switch (field) {
    case CUSTOS_INTERNAL_USER_ID:
      return getCustosInternalUserId();

    case GENDER:
      return getGender();

    case US_CITIZENSHIP:
      return getUsCitizenship();

    case ETHNICITIES:
      return getEthnicities();

    case RACES:
      return getRaces();

    case DISABILITIES:
      return getDisabilities();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case CUSTOS_INTERNAL_USER_ID:
      return isSetCustosInternalUserId();
    case GENDER:
      return isSetGender();
    case US_CITIZENSHIP:
      return isSetUsCitizenship();
    case ETHNICITIES:
      return isSetEthnicities();
    case RACES:
      return isSetRaces();
    case DISABILITIES:
      return isSetDisabilities();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof NSFDemographics)
      return this.equals((NSFDemographics)that);
    return false;
  }

  public boolean equals(NSFDemographics that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_custosInternalUserId = true && this.isSetCustosInternalUserId();
    boolean that_present_custosInternalUserId = true && that.isSetCustosInternalUserId();
    if (this_present_custosInternalUserId || that_present_custosInternalUserId) {
      if (!(this_present_custosInternalUserId && that_present_custosInternalUserId))
        return false;
      if (!this.custosInternalUserId.equals(that.custosInternalUserId))
        return false;
    }

    boolean this_present_gender = true && this.isSetGender();
    boolean that_present_gender = true && that.isSetGender();
    if (this_present_gender || that_present_gender) {
      if (!(this_present_gender && that_present_gender))
        return false;
      if (!this.gender.equals(that.gender))
        return false;
    }

    boolean this_present_usCitizenship = true && this.isSetUsCitizenship();
    boolean that_present_usCitizenship = true && that.isSetUsCitizenship();
    if (this_present_usCitizenship || that_present_usCitizenship) {
      if (!(this_present_usCitizenship && that_present_usCitizenship))
        return false;
      if (!this.usCitizenship.equals(that.usCitizenship))
        return false;
    }

    boolean this_present_ethnicities = true && this.isSetEthnicities();
    boolean that_present_ethnicities = true && that.isSetEthnicities();
    if (this_present_ethnicities || that_present_ethnicities) {
      if (!(this_present_ethnicities && that_present_ethnicities))
        return false;
      if (!this.ethnicities.equals(that.ethnicities))
        return false;
    }

    boolean this_present_races = true && this.isSetRaces();
    boolean that_present_races = true && that.isSetRaces();
    if (this_present_races || that_present_races) {
      if (!(this_present_races && that_present_races))
        return false;
      if (!this.races.equals(that.races))
        return false;
    }

    boolean this_present_disabilities = true && this.isSetDisabilities();
    boolean that_present_disabilities = true && that.isSetDisabilities();
    if (this_present_disabilities || that_present_disabilities) {
      if (!(this_present_disabilities && that_present_disabilities))
        return false;
      if (!this.disabilities.equals(that.disabilities))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetCustosInternalUserId()) ? 131071 : 524287);
    if (isSetCustosInternalUserId())
      hashCode = hashCode * 8191 + custosInternalUserId.hashCode();

    hashCode = hashCode * 8191 + ((isSetGender()) ? 131071 : 524287);
    if (isSetGender())
      hashCode = hashCode * 8191 + gender.hashCode();

    hashCode = hashCode * 8191 + ((isSetUsCitizenship()) ? 131071 : 524287);
    if (isSetUsCitizenship())
      hashCode = hashCode * 8191 + usCitizenship.getValue();

    hashCode = hashCode * 8191 + ((isSetEthnicities()) ? 131071 : 524287);
    if (isSetEthnicities())
      hashCode = hashCode * 8191 + ethnicities.hashCode();

    hashCode = hashCode * 8191 + ((isSetRaces()) ? 131071 : 524287);
    if (isSetRaces())
      hashCode = hashCode * 8191 + races.hashCode();

    hashCode = hashCode * 8191 + ((isSetDisabilities()) ? 131071 : 524287);
    if (isSetDisabilities())
      hashCode = hashCode * 8191 + disabilities.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(NSFDemographics other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetCustosInternalUserId()).compareTo(other.isSetCustosInternalUserId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCustosInternalUserId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.custosInternalUserId, other.custosInternalUserId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetGender()).compareTo(other.isSetGender());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetGender()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.gender, other.gender);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetUsCitizenship()).compareTo(other.isSetUsCitizenship());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUsCitizenship()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.usCitizenship, other.usCitizenship);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetEthnicities()).compareTo(other.isSetEthnicities());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEthnicities()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.ethnicities, other.ethnicities);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRaces()).compareTo(other.isSetRaces());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRaces()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.races, other.races);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDisabilities()).compareTo(other.isSetDisabilities());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDisabilities()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.disabilities, other.disabilities);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("NSFDemographics(");
    boolean first = true;

    sb.append("custosInternalUserId:");
    if (this.custosInternalUserId == null) {
      sb.append("null");
    } else {
      sb.append(this.custosInternalUserId);
    }
    first = false;
    if (isSetGender()) {
      if (!first) sb.append(", ");
      sb.append("gender:");
      if (this.gender == null) {
        sb.append("null");
      } else {
        sb.append(this.gender);
      }
      first = false;
    }
    if (isSetUsCitizenship()) {
      if (!first) sb.append(", ");
      sb.append("usCitizenship:");
      if (this.usCitizenship == null) {
        sb.append("null");
      } else {
        sb.append(this.usCitizenship);
      }
      first = false;
    }
    if (isSetEthnicities()) {
      if (!first) sb.append(", ");
      sb.append("ethnicities:");
      if (this.ethnicities == null) {
        sb.append("null");
      } else {
        sb.append(this.ethnicities);
      }
      first = false;
    }
    if (isSetRaces()) {
      if (!first) sb.append(", ");
      sb.append("races:");
      if (this.races == null) {
        sb.append("null");
      } else {
        sb.append(this.races);
      }
      first = false;
    }
    if (isSetDisabilities()) {
      if (!first) sb.append(", ");
      sb.append("disabilities:");
      if (this.disabilities == null) {
        sb.append("null");
      } else {
        sb.append(this.disabilities);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (custosInternalUserId == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'custosInternalUserId' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class NSFDemographicsStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public NSFDemographicsStandardScheme getScheme() {
      return new NSFDemographicsStandardScheme();
    }
  }

  private static class NSFDemographicsStandardScheme extends org.apache.thrift.scheme.StandardScheme<NSFDemographics> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, NSFDemographics struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CUSTOS_INTERNAL_USER_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.custosInternalUserId = iprot.readString();
              struct.setCustosInternalUserIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // GENDER
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.gender = iprot.readString();
              struct.setGenderIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // US_CITIZENSHIP
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.usCitizenship = USCitizenship.findByValue(iprot.readI32());
              struct.setUsCitizenshipIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // ETHNICITIES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                struct.ethnicities = new java.util.ArrayList<ethnicity>(_list0.size);
                @org.apache.thrift.annotation.Nullable ethnicity _elem1;
                for (int _i2 = 0; _i2 < _list0.size; ++_i2)
                {
                  _elem1 = ethnicity.findByValue(iprot.readI32());
                  if (_elem1 != null)
                  {
                    struct.ethnicities.add(_elem1);
                  }
                }
                iprot.readListEnd();
              }
              struct.setEthnicitiesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // RACES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list3 = iprot.readListBegin();
                struct.races = new java.util.ArrayList<race>(_list3.size);
                @org.apache.thrift.annotation.Nullable race _elem4;
                for (int _i5 = 0; _i5 < _list3.size; ++_i5)
                {
                  _elem4 = race.findByValue(iprot.readI32());
                  if (_elem4 != null)
                  {
                    struct.races.add(_elem4);
                  }
                }
                iprot.readListEnd();
              }
              struct.setRacesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // DISABILITIES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list6 = iprot.readListBegin();
                struct.disabilities = new java.util.ArrayList<disability>(_list6.size);
                @org.apache.thrift.annotation.Nullable disability _elem7;
                for (int _i8 = 0; _i8 < _list6.size; ++_i8)
                {
                  _elem7 = disability.findByValue(iprot.readI32());
                  if (_elem7 != null)
                  {
                    struct.disabilities.add(_elem7);
                  }
                }
                iprot.readListEnd();
              }
              struct.setDisabilitiesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, NSFDemographics struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.custosInternalUserId != null) {
        oprot.writeFieldBegin(CUSTOS_INTERNAL_USER_ID_FIELD_DESC);
        oprot.writeString(struct.custosInternalUserId);
        oprot.writeFieldEnd();
      }
      if (struct.gender != null) {
        if (struct.isSetGender()) {
          oprot.writeFieldBegin(GENDER_FIELD_DESC);
          oprot.writeString(struct.gender);
          oprot.writeFieldEnd();
        }
      }
      if (struct.usCitizenship != null) {
        if (struct.isSetUsCitizenship()) {
          oprot.writeFieldBegin(US_CITIZENSHIP_FIELD_DESC);
          oprot.writeI32(struct.usCitizenship.getValue());
          oprot.writeFieldEnd();
        }
      }
      if (struct.ethnicities != null) {
        if (struct.isSetEthnicities()) {
          oprot.writeFieldBegin(ETHNICITIES_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I32, struct.ethnicities.size()));
            for (ethnicity _iter9 : struct.ethnicities)
            {
              oprot.writeI32(_iter9.getValue());
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.races != null) {
        if (struct.isSetRaces()) {
          oprot.writeFieldBegin(RACES_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I32, struct.races.size()));
            for (race _iter10 : struct.races)
            {
              oprot.writeI32(_iter10.getValue());
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.disabilities != null) {
        if (struct.isSetDisabilities()) {
          oprot.writeFieldBegin(DISABILITIES_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I32, struct.disabilities.size()));
            for (disability _iter11 : struct.disabilities)
            {
              oprot.writeI32(_iter11.getValue());
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class NSFDemographicsTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public NSFDemographicsTupleScheme getScheme() {
      return new NSFDemographicsTupleScheme();
    }
  }

  private static class NSFDemographicsTupleScheme extends org.apache.thrift.scheme.TupleScheme<NSFDemographics> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, NSFDemographics struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeString(struct.custosInternalUserId);
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetGender()) {
        optionals.set(0);
      }
      if (struct.isSetUsCitizenship()) {
        optionals.set(1);
      }
      if (struct.isSetEthnicities()) {
        optionals.set(2);
      }
      if (struct.isSetRaces()) {
        optionals.set(3);
      }
      if (struct.isSetDisabilities()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetGender()) {
        oprot.writeString(struct.gender);
      }
      if (struct.isSetUsCitizenship()) {
        oprot.writeI32(struct.usCitizenship.getValue());
      }
      if (struct.isSetEthnicities()) {
        {
          oprot.writeI32(struct.ethnicities.size());
          for (ethnicity _iter12 : struct.ethnicities)
          {
            oprot.writeI32(_iter12.getValue());
          }
        }
      }
      if (struct.isSetRaces()) {
        {
          oprot.writeI32(struct.races.size());
          for (race _iter13 : struct.races)
          {
            oprot.writeI32(_iter13.getValue());
          }
        }
      }
      if (struct.isSetDisabilities()) {
        {
          oprot.writeI32(struct.disabilities.size());
          for (disability _iter14 : struct.disabilities)
          {
            oprot.writeI32(_iter14.getValue());
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, NSFDemographics struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.custosInternalUserId = iprot.readString();
      struct.setCustosInternalUserIdIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.gender = iprot.readString();
        struct.setGenderIsSet(true);
      }
      if (incoming.get(1)) {
        struct.usCitizenship = USCitizenship.findByValue(iprot.readI32());
        struct.setUsCitizenshipIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TList _list15 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I32, iprot.readI32());
          struct.ethnicities = new java.util.ArrayList<ethnicity>(_list15.size);
          @org.apache.thrift.annotation.Nullable ethnicity _elem16;
          for (int _i17 = 0; _i17 < _list15.size; ++_i17)
          {
            _elem16 = ethnicity.findByValue(iprot.readI32());
            if (_elem16 != null)
            {
              struct.ethnicities.add(_elem16);
            }
          }
        }
        struct.setEthnicitiesIsSet(true);
      }
      if (incoming.get(3)) {
        {
          org.apache.thrift.protocol.TList _list18 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I32, iprot.readI32());
          struct.races = new java.util.ArrayList<race>(_list18.size);
          @org.apache.thrift.annotation.Nullable race _elem19;
          for (int _i20 = 0; _i20 < _list18.size; ++_i20)
          {
            _elem19 = race.findByValue(iprot.readI32());
            if (_elem19 != null)
            {
              struct.races.add(_elem19);
            }
          }
        }
        struct.setRacesIsSet(true);
      }
      if (incoming.get(4)) {
        {
          org.apache.thrift.protocol.TList _list21 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I32, iprot.readI32());
          struct.disabilities = new java.util.ArrayList<disability>(_list21.size);
          @org.apache.thrift.annotation.Nullable disability _elem22;
          for (int _i23 = 0; _i23 < _list21.size; ++_i23)
          {
            _elem22 = disability.findByValue(iprot.readI32());
            if (_elem22 != null)
            {
              struct.disabilities.add(_elem22);
            }
          }
        }
        struct.setDisabilitiesIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

