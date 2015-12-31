// ORM class for table 'null'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Tue Dec 29 22:29:29 CST 2015
// For connector: org.apache.sqoop.manager.OracleManager
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import com.cloudera.sqoop.lib.JdbcWritableBridge;
import com.cloudera.sqoop.lib.DelimiterSet;
import com.cloudera.sqoop.lib.FieldFormatter;
import com.cloudera.sqoop.lib.RecordParser;
import com.cloudera.sqoop.lib.BooleanParser;
import com.cloudera.sqoop.lib.BlobRef;
import com.cloudera.sqoop.lib.ClobRef;
import com.cloudera.sqoop.lib.LargeObjectLoader;
import com.cloudera.sqoop.lib.SqoopRecord;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class QueryResult extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  protected ResultSet __cur_result_set;
  private String MESHID3;
  public String get_MESHID3() {
    return MESHID3;
  }
  public void set_MESHID3(String MESHID3) {
    this.MESHID3 = MESHID3;
  }
  public QueryResult with_MESHID3(String MESHID3) {
    this.MESHID3 = MESHID3;
    return this;
  }
  private String OLDNUM;
  public String get_OLDNUM() {
    return OLDNUM;
  }
  public void set_OLDNUM(String OLDNUM) {
    this.OLDNUM = OLDNUM;
  }
  public QueryResult with_OLDNUM(String OLDNUM) {
    this.OLDNUM = OLDNUM;
    return this;
  }
  private String POINUM;
  public String get_POINUM() {
    return POINUM;
  }
  public void set_POINUM(String POINUM) {
    this.POINUM = POINUM;
  }
  public QueryResult with_POINUM(String POINUM) {
    this.POINUM = POINUM;
    return this;
  }
  private String POIKIND;
  public String get_POIKIND() {
    return POIKIND;
  }
  public void set_POIKIND(String POIKIND) {
    this.POIKIND = POIKIND;
  }
  public QueryResult with_POIKIND(String POIKIND) {
    this.POIKIND = POIKIND;
    return this;
  }
  private String OLDNAME;
  public String get_OLDNAME() {
    return OLDNAME;
  }
  public void set_OLDNAME(String OLDNAME) {
    this.OLDNAME = OLDNAME;
  }
  public QueryResult with_OLDNAME(String OLDNAME) {
    this.OLDNAME = OLDNAME;
    return this;
  }
  private String POINAME;
  public String get_POINAME() {
    return POINAME;
  }
  public void set_POINAME(String POINAME) {
    this.POINAME = POINAME;
  }
  public QueryResult with_POINAME(String POINAME) {
    this.POINAME = POINAME;
    return this;
  }
  private String POIPY;
  public String get_POIPY() {
    return POIPY;
  }
  public void set_POIPY(String POIPY) {
    this.POIPY = POIPY;
  }
  public QueryResult with_POIPY(String POIPY) {
    this.POIPY = POIPY;
    return this;
  }
  private String ADMINAREACODE;
  public String get_ADMINAREACODE() {
    return ADMINAREACODE;
  }
  public void set_ADMINAREACODE(String ADMINAREACODE) {
    this.ADMINAREACODE = ADMINAREACODE;
  }
  public QueryResult with_ADMINAREACODE(String ADMINAREACODE) {
    this.ADMINAREACODE = ADMINAREACODE;
    return this;
  }
  private String BLOCKCODE;
  public String get_BLOCKCODE() {
    return BLOCKCODE;
  }
  public void set_BLOCKCODE(String BLOCKCODE) {
    this.BLOCKCODE = BLOCKCODE;
  }
  public QueryResult with_BLOCKCODE(String BLOCKCODE) {
    this.BLOCKCODE = BLOCKCODE;
    return this;
  }
  private String TELEPHONE;
  public String get_TELEPHONE() {
    return TELEPHONE;
  }
  public void set_TELEPHONE(String TELEPHONE) {
    this.TELEPHONE = TELEPHONE;
  }
  public QueryResult with_TELEPHONE(String TELEPHONE) {
    this.TELEPHONE = TELEPHONE;
    return this;
  }
  private String TELETYPE;
  public String get_TELETYPE() {
    return TELETYPE;
  }
  public void set_TELETYPE(String TELETYPE) {
    this.TELETYPE = TELETYPE;
  }
  public QueryResult with_TELETYPE(String TELETYPE) {
    this.TELETYPE = TELETYPE;
    return this;
  }
  private String POSTCODE;
  public String get_POSTCODE() {
    return POSTCODE;
  }
  public void set_POSTCODE(String POSTCODE) {
    this.POSTCODE = POSTCODE;
  }
  public QueryResult with_POSTCODE(String POSTCODE) {
    this.POSTCODE = POSTCODE;
    return this;
  }
  private java.math.BigDecimal X;
  public java.math.BigDecimal get_X() {
    return X;
  }
  public void set_X(java.math.BigDecimal X) {
    this.X = X;
  }
  public QueryResult with_X(java.math.BigDecimal X) {
    this.X = X;
    return this;
  }
  private java.math.BigDecimal Y;
  public java.math.BigDecimal get_Y() {
    return Y;
  }
  public void set_Y(java.math.BigDecimal Y) {
    this.Y = Y;
  }
  public QueryResult with_Y(java.math.BigDecimal Y) {
    this.Y = Y;
    return this;
  }
  private java.math.BigDecimal DX;
  public java.math.BigDecimal get_DX() {
    return DX;
  }
  public void set_DX(java.math.BigDecimal DX) {
    this.DX = DX;
  }
  public QueryResult with_DX(java.math.BigDecimal DX) {
    this.DX = DX;
    return this;
  }
  private java.math.BigDecimal DY;
  public java.math.BigDecimal get_DY() {
    return DY;
  }
  public void set_DY(java.math.BigDecimal DY) {
    this.DY = DY;
  }
  public QueryResult with_DY(java.math.BigDecimal DY) {
    this.DY = DY;
    return this;
  }
  private java.math.BigDecimal KWX;
  public java.math.BigDecimal get_KWX() {
    return KWX;
  }
  public void set_KWX(java.math.BigDecimal KWX) {
    this.KWX = KWX;
  }
  public QueryResult with_KWX(java.math.BigDecimal KWX) {
    this.KWX = KWX;
    return this;
  }
  private java.math.BigDecimal KWY;
  public java.math.BigDecimal get_KWY() {
    return KWY;
  }
  public void set_KWY(java.math.BigDecimal KWY) {
    this.KWY = KWY;
  }
  public QueryResult with_KWY(java.math.BigDecimal KWY) {
    this.KWY = KWY;
    return this;
  }
  private java.math.BigDecimal KWDX;
  public java.math.BigDecimal get_KWDX() {
    return KWDX;
  }
  public void set_KWDX(java.math.BigDecimal KWDX) {
    this.KWDX = KWDX;
  }
  public QueryResult with_KWDX(java.math.BigDecimal KWDX) {
    this.KWDX = KWDX;
    return this;
  }
  private java.math.BigDecimal KWDY;
  public java.math.BigDecimal get_KWDY() {
    return KWDY;
  }
  public void set_KWDY(java.math.BigDecimal KWDY) {
    this.KWDY = KWDY;
  }
  public QueryResult with_KWDY(java.math.BigDecimal KWDY) {
    this.KWDY = KWDY;
    return this;
  }
  private String POIMEMO;
  public String get_POIMEMO() {
    return POIMEMO;
  }
  public void set_POIMEMO(String POIMEMO) {
    this.POIMEMO = POIMEMO;
  }
  public QueryResult with_POIMEMO(String POIMEMO) {
    this.POIMEMO = POIMEMO;
    return this;
  }
  private String IMPORTANCE;
  public String get_IMPORTANCE() {
    return IMPORTANCE;
  }
  public void set_IMPORTANCE(String IMPORTANCE) {
    this.IMPORTANCE = IMPORTANCE;
  }
  public QueryResult with_IMPORTANCE(String IMPORTANCE) {
    this.IMPORTANCE = IMPORTANCE;
    return this;
  }
  private String POIFLAG;
  public String get_POIFLAG() {
    return POIFLAG;
  }
  public void set_POIFLAG(String POIFLAG) {
    this.POIFLAG = POIFLAG;
  }
  public QueryResult with_POIFLAG(String POIFLAG) {
    this.POIFLAG = POIFLAG;
    return this;
  }
  private String GDF_ENGLISHNAME;
  public String get_GDF_ENGLISHNAME() {
    return GDF_ENGLISHNAME;
  }
  public void set_GDF_ENGLISHNAME(String GDF_ENGLISHNAME) {
    this.GDF_ENGLISHNAME = GDF_ENGLISHNAME;
  }
  public QueryResult with_GDF_ENGLISHNAME(String GDF_ENGLISHNAME) {
    this.GDF_ENGLISHNAME = GDF_ENGLISHNAME;
    return this;
  }
  private String GDF_ORIGINENG;
  public String get_GDF_ORIGINENG() {
    return GDF_ORIGINENG;
  }
  public void set_GDF_ORIGINENG(String GDF_ORIGINENG) {
    this.GDF_ORIGINENG = GDF_ORIGINENG;
  }
  public QueryResult with_GDF_ORIGINENG(String GDF_ORIGINENG) {
    this.GDF_ORIGINENG = GDF_ORIGINENG;
    return this;
  }
  private String GDF_ENGCLASS;
  public String get_GDF_ENGCLASS() {
    return GDF_ENGCLASS;
  }
  public void set_GDF_ENGCLASS(String GDF_ENGCLASS) {
    this.GDF_ENGCLASS = GDF_ENGCLASS;
  }
  public QueryResult with_GDF_ENGCLASS(String GDF_ENGCLASS) {
    this.GDF_ENGCLASS = GDF_ENGCLASS;
    return this;
  }
  private String VANITYCITY;
  public String get_VANITYCITY() {
    return VANITYCITY;
  }
  public void set_VANITYCITY(String VANITYCITY) {
    this.VANITYCITY = VANITYCITY;
  }
  public QueryResult with_VANITYCITY(String VANITYCITY) {
    this.VANITYCITY = VANITYCITY;
    return this;
  }
  private String SAITEM;
  public String get_SAITEM() {
    return SAITEM;
  }
  public void set_SAITEM(String SAITEM) {
    this.SAITEM = SAITEM;
  }
  public QueryResult with_SAITEM(String SAITEM) {
    this.SAITEM = SAITEM;
    return this;
  }
  private String CHAIN;
  public String get_CHAIN() {
    return CHAIN;
  }
  public void set_CHAIN(String CHAIN) {
    this.CHAIN = CHAIN;
  }
  public QueryResult with_CHAIN(String CHAIN) {
    this.CHAIN = CHAIN;
    return this;
  }
  private String SIGHTLEVEL;
  public String get_SIGHTLEVEL() {
    return SIGHTLEVEL;
  }
  public void set_SIGHTLEVEL(String SIGHTLEVEL) {
    this.SIGHTLEVEL = SIGHTLEVEL;
  }
  public QueryResult with_SIGHTLEVEL(String SIGHTLEVEL) {
    this.SIGHTLEVEL = SIGHTLEVEL;
    return this;
  }
  private String STATE;
  public String get_STATE() {
    return STATE;
  }
  public void set_STATE(String STATE) {
    this.STATE = STATE;
  }
  public QueryResult with_STATE(String STATE) {
    this.STATE = STATE;
    return this;
  }
  private String LABEL;
  public String get_LABEL() {
    return LABEL;
  }
  public void set_LABEL(String LABEL) {
    this.LABEL = LABEL;
  }
  public QueryResult with_LABEL(String LABEL) {
    this.LABEL = LABEL;
    return this;
  }
  private String FATHERSON;
  public String get_FATHERSON() {
    return FATHERSON;
  }
  public void set_FATHERSON(String FATHERSON) {
    this.FATHERSON = FATHERSON;
  }
  public QueryResult with_FATHERSON(String FATHERSON) {
    this.FATHERSON = FATHERSON;
    return this;
  }
  private String LOG;
  public String get_LOG() {
    return LOG;
  }
  public void set_LOG(String LOG) {
    this.LOG = LOG;
  }
  public QueryResult with_LOG(String LOG) {
    this.LOG = LOG;
    return this;
  }
  private String ALIASNAME;
  public String get_ALIASNAME() {
    return ALIASNAME;
  }
  public void set_ALIASNAME(String ALIASNAME) {
    this.ALIASNAME = ALIASNAME;
  }
  public QueryResult with_ALIASNAME(String ALIASNAME) {
    this.ALIASNAME = ALIASNAME;
    return this;
  }
  private String ALIASPY;
  public String get_ALIASPY() {
    return ALIASPY;
  }
  public void set_ALIASPY(String ALIASPY) {
    this.ALIASPY = ALIASPY;
  }
  public QueryResult with_ALIASPY(String ALIASPY) {
    this.ALIASPY = ALIASPY;
    return this;
  }
  private String POIASSOCIATION;
  public String get_POIASSOCIATION() {
    return POIASSOCIATION;
  }
  public void set_POIASSOCIATION(String POIASSOCIATION) {
    this.POIASSOCIATION = POIASSOCIATION;
  }
  public QueryResult with_POIASSOCIATION(String POIASSOCIATION) {
    this.POIASSOCIATION = POIASSOCIATION;
    return this;
  }
  private String FOODTYPE;
  public String get_FOODTYPE() {
    return FOODTYPE;
  }
  public void set_FOODTYPE(String FOODTYPE) {
    this.FOODTYPE = FOODTYPE;
  }
  public QueryResult with_FOODTYPE(String FOODTYPE) {
    this.FOODTYPE = FOODTYPE;
    return this;
  }
  private String MENUNAME;
  public String get_MENUNAME() {
    return MENUNAME;
  }
  public void set_MENUNAME(String MENUNAME) {
    this.MENUNAME = MENUNAME;
  }
  public QueryResult with_MENUNAME(String MENUNAME) {
    this.MENUNAME = MENUNAME;
    return this;
  }
  private String POIADDRESS;
  public String get_POIADDRESS() {
    return POIADDRESS;
  }
  public void set_POIADDRESS(String POIADDRESS) {
    this.POIADDRESS = POIADDRESS;
  }
  public QueryResult with_POIADDRESS(String POIADDRESS) {
    this.POIADDRESS = POIADDRESS;
    return this;
  }
  private String ADDRCOMEFROM;
  public String get_ADDRCOMEFROM() {
    return ADDRCOMEFROM;
  }
  public void set_ADDRCOMEFROM(String ADDRCOMEFROM) {
    this.ADDRCOMEFROM = ADDRCOMEFROM;
  }
  public QueryResult with_ADDRCOMEFROM(String ADDRCOMEFROM) {
    this.ADDRCOMEFROM = ADDRCOMEFROM;
    return this;
  }
  private String OLDADDRESS;
  public String get_OLDADDRESS() {
    return OLDADDRESS;
  }
  public void set_OLDADDRESS(String OLDADDRESS) {
    this.OLDADDRESS = OLDADDRESS;
  }
  public QueryResult with_OLDADDRESS(String OLDADDRESS) {
    this.OLDADDRESS = OLDADDRESS;
    return this;
  }
  private String OPENING24;
  public String get_OPENING24() {
    return OPENING24;
  }
  public void set_OPENING24(String OPENING24) {
    this.OPENING24 = OPENING24;
  }
  public QueryResult with_OPENING24(String OPENING24) {
    this.OPENING24 = OPENING24;
    return this;
  }
  private String PID;
  public String get_PID() {
    return PID;
  }
  public void set_PID(String PID) {
    this.PID = PID;
  }
  public QueryResult with_PID(String PID) {
    this.PID = PID;
    return this;
  }
  private String POIKIND2;
  public String get_POIKIND2() {
    return POIKIND2;
  }
  public void set_POIKIND2(String POIKIND2) {
    this.POIKIND2 = POIKIND2;
  }
  public QueryResult with_POIKIND2(String POIKIND2) {
    this.POIKIND2 = POIKIND2;
    return this;
  }
  private String POIKINDOTHER;
  public String get_POIKINDOTHER() {
    return POIKINDOTHER;
  }
  public void set_POIKINDOTHER(String POIKINDOTHER) {
    this.POIKINDOTHER = POIKINDOTHER;
  }
  public QueryResult with_POIKINDOTHER(String POIKINDOTHER) {
    this.POIKINDOTHER = POIKINDOTHER;
    return this;
  }
  private String LINK_PID;
  public String get_LINK_PID() {
    return LINK_PID;
  }
  public void set_LINK_PID(String LINK_PID) {
    this.LINK_PID = LINK_PID;
  }
  public QueryResult with_LINK_PID(String LINK_PID) {
    this.LINK_PID = LINK_PID;
    return this;
  }
  private String HOTEL_RATING;
  public String get_HOTEL_RATING() {
    return HOTEL_RATING;
  }
  public void set_HOTEL_RATING(String HOTEL_RATING) {
    this.HOTEL_RATING = HOTEL_RATING;
  }
  public QueryResult with_HOTEL_RATING(String HOTEL_RATING) {
    this.HOTEL_RATING = HOTEL_RATING;
    return this;
  }
  private String ADMINAREACODE_15AUT;
  public String get_ADMINAREACODE_15AUT() {
    return ADMINAREACODE_15AUT;
  }
  public void set_ADMINAREACODE_15AUT(String ADMINAREACODE_15AUT) {
    this.ADMINAREACODE_15AUT = ADMINAREACODE_15AUT;
  }
  public QueryResult with_ADMINAREACODE_15AUT(String ADMINAREACODE_15AUT) {
    this.ADMINAREACODE_15AUT = ADMINAREACODE_15AUT;
    return this;
  }
  private String POI_LEVEL;
  public String get_POI_LEVEL() {
    return POI_LEVEL;
  }
  public void set_POI_LEVEL(String POI_LEVEL) {
    this.POI_LEVEL = POI_LEVEL;
  }
  public QueryResult with_POI_LEVEL(String POI_LEVEL) {
    this.POI_LEVEL = POI_LEVEL;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof QueryResult)) {
      return false;
    }
    QueryResult that = (QueryResult) o;
    boolean equal = true;
    equal = equal && (this.MESHID3 == null ? that.MESHID3 == null : this.MESHID3.equals(that.MESHID3));
    equal = equal && (this.OLDNUM == null ? that.OLDNUM == null : this.OLDNUM.equals(that.OLDNUM));
    equal = equal && (this.POINUM == null ? that.POINUM == null : this.POINUM.equals(that.POINUM));
    equal = equal && (this.POIKIND == null ? that.POIKIND == null : this.POIKIND.equals(that.POIKIND));
    equal = equal && (this.OLDNAME == null ? that.OLDNAME == null : this.OLDNAME.equals(that.OLDNAME));
    equal = equal && (this.POINAME == null ? that.POINAME == null : this.POINAME.equals(that.POINAME));
    equal = equal && (this.POIPY == null ? that.POIPY == null : this.POIPY.equals(that.POIPY));
    equal = equal && (this.ADMINAREACODE == null ? that.ADMINAREACODE == null : this.ADMINAREACODE.equals(that.ADMINAREACODE));
    equal = equal && (this.BLOCKCODE == null ? that.BLOCKCODE == null : this.BLOCKCODE.equals(that.BLOCKCODE));
    equal = equal && (this.TELEPHONE == null ? that.TELEPHONE == null : this.TELEPHONE.equals(that.TELEPHONE));
    equal = equal && (this.TELETYPE == null ? that.TELETYPE == null : this.TELETYPE.equals(that.TELETYPE));
    equal = equal && (this.POSTCODE == null ? that.POSTCODE == null : this.POSTCODE.equals(that.POSTCODE));
    equal = equal && (this.X == null ? that.X == null : this.X.equals(that.X));
    equal = equal && (this.Y == null ? that.Y == null : this.Y.equals(that.Y));
    equal = equal && (this.DX == null ? that.DX == null : this.DX.equals(that.DX));
    equal = equal && (this.DY == null ? that.DY == null : this.DY.equals(that.DY));
    equal = equal && (this.KWX == null ? that.KWX == null : this.KWX.equals(that.KWX));
    equal = equal && (this.KWY == null ? that.KWY == null : this.KWY.equals(that.KWY));
    equal = equal && (this.KWDX == null ? that.KWDX == null : this.KWDX.equals(that.KWDX));
    equal = equal && (this.KWDY == null ? that.KWDY == null : this.KWDY.equals(that.KWDY));
    equal = equal && (this.POIMEMO == null ? that.POIMEMO == null : this.POIMEMO.equals(that.POIMEMO));
    equal = equal && (this.IMPORTANCE == null ? that.IMPORTANCE == null : this.IMPORTANCE.equals(that.IMPORTANCE));
    equal = equal && (this.POIFLAG == null ? that.POIFLAG == null : this.POIFLAG.equals(that.POIFLAG));
    equal = equal && (this.GDF_ENGLISHNAME == null ? that.GDF_ENGLISHNAME == null : this.GDF_ENGLISHNAME.equals(that.GDF_ENGLISHNAME));
    equal = equal && (this.GDF_ORIGINENG == null ? that.GDF_ORIGINENG == null : this.GDF_ORIGINENG.equals(that.GDF_ORIGINENG));
    equal = equal && (this.GDF_ENGCLASS == null ? that.GDF_ENGCLASS == null : this.GDF_ENGCLASS.equals(that.GDF_ENGCLASS));
    equal = equal && (this.VANITYCITY == null ? that.VANITYCITY == null : this.VANITYCITY.equals(that.VANITYCITY));
    equal = equal && (this.SAITEM == null ? that.SAITEM == null : this.SAITEM.equals(that.SAITEM));
    equal = equal && (this.CHAIN == null ? that.CHAIN == null : this.CHAIN.equals(that.CHAIN));
    equal = equal && (this.SIGHTLEVEL == null ? that.SIGHTLEVEL == null : this.SIGHTLEVEL.equals(that.SIGHTLEVEL));
    equal = equal && (this.STATE == null ? that.STATE == null : this.STATE.equals(that.STATE));
    equal = equal && (this.LABEL == null ? that.LABEL == null : this.LABEL.equals(that.LABEL));
    equal = equal && (this.FATHERSON == null ? that.FATHERSON == null : this.FATHERSON.equals(that.FATHERSON));
    equal = equal && (this.LOG == null ? that.LOG == null : this.LOG.equals(that.LOG));
    equal = equal && (this.ALIASNAME == null ? that.ALIASNAME == null : this.ALIASNAME.equals(that.ALIASNAME));
    equal = equal && (this.ALIASPY == null ? that.ALIASPY == null : this.ALIASPY.equals(that.ALIASPY));
    equal = equal && (this.POIASSOCIATION == null ? that.POIASSOCIATION == null : this.POIASSOCIATION.equals(that.POIASSOCIATION));
    equal = equal && (this.FOODTYPE == null ? that.FOODTYPE == null : this.FOODTYPE.equals(that.FOODTYPE));
    equal = equal && (this.MENUNAME == null ? that.MENUNAME == null : this.MENUNAME.equals(that.MENUNAME));
    equal = equal && (this.POIADDRESS == null ? that.POIADDRESS == null : this.POIADDRESS.equals(that.POIADDRESS));
    equal = equal && (this.ADDRCOMEFROM == null ? that.ADDRCOMEFROM == null : this.ADDRCOMEFROM.equals(that.ADDRCOMEFROM));
    equal = equal && (this.OLDADDRESS == null ? that.OLDADDRESS == null : this.OLDADDRESS.equals(that.OLDADDRESS));
    equal = equal && (this.OPENING24 == null ? that.OPENING24 == null : this.OPENING24.equals(that.OPENING24));
    equal = equal && (this.PID == null ? that.PID == null : this.PID.equals(that.PID));
    equal = equal && (this.POIKIND2 == null ? that.POIKIND2 == null : this.POIKIND2.equals(that.POIKIND2));
    equal = equal && (this.POIKINDOTHER == null ? that.POIKINDOTHER == null : this.POIKINDOTHER.equals(that.POIKINDOTHER));
    equal = equal && (this.LINK_PID == null ? that.LINK_PID == null : this.LINK_PID.equals(that.LINK_PID));
    equal = equal && (this.HOTEL_RATING == null ? that.HOTEL_RATING == null : this.HOTEL_RATING.equals(that.HOTEL_RATING));
    equal = equal && (this.ADMINAREACODE_15AUT == null ? that.ADMINAREACODE_15AUT == null : this.ADMINAREACODE_15AUT.equals(that.ADMINAREACODE_15AUT));
    equal = equal && (this.POI_LEVEL == null ? that.POI_LEVEL == null : this.POI_LEVEL.equals(that.POI_LEVEL));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof QueryResult)) {
      return false;
    }
    QueryResult that = (QueryResult) o;
    boolean equal = true;
    equal = equal && (this.MESHID3 == null ? that.MESHID3 == null : this.MESHID3.equals(that.MESHID3));
    equal = equal && (this.OLDNUM == null ? that.OLDNUM == null : this.OLDNUM.equals(that.OLDNUM));
    equal = equal && (this.POINUM == null ? that.POINUM == null : this.POINUM.equals(that.POINUM));
    equal = equal && (this.POIKIND == null ? that.POIKIND == null : this.POIKIND.equals(that.POIKIND));
    equal = equal && (this.OLDNAME == null ? that.OLDNAME == null : this.OLDNAME.equals(that.OLDNAME));
    equal = equal && (this.POINAME == null ? that.POINAME == null : this.POINAME.equals(that.POINAME));
    equal = equal && (this.POIPY == null ? that.POIPY == null : this.POIPY.equals(that.POIPY));
    equal = equal && (this.ADMINAREACODE == null ? that.ADMINAREACODE == null : this.ADMINAREACODE.equals(that.ADMINAREACODE));
    equal = equal && (this.BLOCKCODE == null ? that.BLOCKCODE == null : this.BLOCKCODE.equals(that.BLOCKCODE));
    equal = equal && (this.TELEPHONE == null ? that.TELEPHONE == null : this.TELEPHONE.equals(that.TELEPHONE));
    equal = equal && (this.TELETYPE == null ? that.TELETYPE == null : this.TELETYPE.equals(that.TELETYPE));
    equal = equal && (this.POSTCODE == null ? that.POSTCODE == null : this.POSTCODE.equals(that.POSTCODE));
    equal = equal && (this.X == null ? that.X == null : this.X.equals(that.X));
    equal = equal && (this.Y == null ? that.Y == null : this.Y.equals(that.Y));
    equal = equal && (this.DX == null ? that.DX == null : this.DX.equals(that.DX));
    equal = equal && (this.DY == null ? that.DY == null : this.DY.equals(that.DY));
    equal = equal && (this.KWX == null ? that.KWX == null : this.KWX.equals(that.KWX));
    equal = equal && (this.KWY == null ? that.KWY == null : this.KWY.equals(that.KWY));
    equal = equal && (this.KWDX == null ? that.KWDX == null : this.KWDX.equals(that.KWDX));
    equal = equal && (this.KWDY == null ? that.KWDY == null : this.KWDY.equals(that.KWDY));
    equal = equal && (this.POIMEMO == null ? that.POIMEMO == null : this.POIMEMO.equals(that.POIMEMO));
    equal = equal && (this.IMPORTANCE == null ? that.IMPORTANCE == null : this.IMPORTANCE.equals(that.IMPORTANCE));
    equal = equal && (this.POIFLAG == null ? that.POIFLAG == null : this.POIFLAG.equals(that.POIFLAG));
    equal = equal && (this.GDF_ENGLISHNAME == null ? that.GDF_ENGLISHNAME == null : this.GDF_ENGLISHNAME.equals(that.GDF_ENGLISHNAME));
    equal = equal && (this.GDF_ORIGINENG == null ? that.GDF_ORIGINENG == null : this.GDF_ORIGINENG.equals(that.GDF_ORIGINENG));
    equal = equal && (this.GDF_ENGCLASS == null ? that.GDF_ENGCLASS == null : this.GDF_ENGCLASS.equals(that.GDF_ENGCLASS));
    equal = equal && (this.VANITYCITY == null ? that.VANITYCITY == null : this.VANITYCITY.equals(that.VANITYCITY));
    equal = equal && (this.SAITEM == null ? that.SAITEM == null : this.SAITEM.equals(that.SAITEM));
    equal = equal && (this.CHAIN == null ? that.CHAIN == null : this.CHAIN.equals(that.CHAIN));
    equal = equal && (this.SIGHTLEVEL == null ? that.SIGHTLEVEL == null : this.SIGHTLEVEL.equals(that.SIGHTLEVEL));
    equal = equal && (this.STATE == null ? that.STATE == null : this.STATE.equals(that.STATE));
    equal = equal && (this.LABEL == null ? that.LABEL == null : this.LABEL.equals(that.LABEL));
    equal = equal && (this.FATHERSON == null ? that.FATHERSON == null : this.FATHERSON.equals(that.FATHERSON));
    equal = equal && (this.LOG == null ? that.LOG == null : this.LOG.equals(that.LOG));
    equal = equal && (this.ALIASNAME == null ? that.ALIASNAME == null : this.ALIASNAME.equals(that.ALIASNAME));
    equal = equal && (this.ALIASPY == null ? that.ALIASPY == null : this.ALIASPY.equals(that.ALIASPY));
    equal = equal && (this.POIASSOCIATION == null ? that.POIASSOCIATION == null : this.POIASSOCIATION.equals(that.POIASSOCIATION));
    equal = equal && (this.FOODTYPE == null ? that.FOODTYPE == null : this.FOODTYPE.equals(that.FOODTYPE));
    equal = equal && (this.MENUNAME == null ? that.MENUNAME == null : this.MENUNAME.equals(that.MENUNAME));
    equal = equal && (this.POIADDRESS == null ? that.POIADDRESS == null : this.POIADDRESS.equals(that.POIADDRESS));
    equal = equal && (this.ADDRCOMEFROM == null ? that.ADDRCOMEFROM == null : this.ADDRCOMEFROM.equals(that.ADDRCOMEFROM));
    equal = equal && (this.OLDADDRESS == null ? that.OLDADDRESS == null : this.OLDADDRESS.equals(that.OLDADDRESS));
    equal = equal && (this.OPENING24 == null ? that.OPENING24 == null : this.OPENING24.equals(that.OPENING24));
    equal = equal && (this.PID == null ? that.PID == null : this.PID.equals(that.PID));
    equal = equal && (this.POIKIND2 == null ? that.POIKIND2 == null : this.POIKIND2.equals(that.POIKIND2));
    equal = equal && (this.POIKINDOTHER == null ? that.POIKINDOTHER == null : this.POIKINDOTHER.equals(that.POIKINDOTHER));
    equal = equal && (this.LINK_PID == null ? that.LINK_PID == null : this.LINK_PID.equals(that.LINK_PID));
    equal = equal && (this.HOTEL_RATING == null ? that.HOTEL_RATING == null : this.HOTEL_RATING.equals(that.HOTEL_RATING));
    equal = equal && (this.ADMINAREACODE_15AUT == null ? that.ADMINAREACODE_15AUT == null : this.ADMINAREACODE_15AUT.equals(that.ADMINAREACODE_15AUT));
    equal = equal && (this.POI_LEVEL == null ? that.POI_LEVEL == null : this.POI_LEVEL.equals(that.POI_LEVEL));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.MESHID3 = JdbcWritableBridge.readString(1, __dbResults);
    this.OLDNUM = JdbcWritableBridge.readString(2, __dbResults);
    this.POINUM = JdbcWritableBridge.readString(3, __dbResults);
    this.POIKIND = JdbcWritableBridge.readString(4, __dbResults);
    this.OLDNAME = JdbcWritableBridge.readString(5, __dbResults);
    this.POINAME = JdbcWritableBridge.readString(6, __dbResults);
    this.POIPY = JdbcWritableBridge.readString(7, __dbResults);
    this.ADMINAREACODE = JdbcWritableBridge.readString(8, __dbResults);
    this.BLOCKCODE = JdbcWritableBridge.readString(9, __dbResults);
    this.TELEPHONE = JdbcWritableBridge.readString(10, __dbResults);
    this.TELETYPE = JdbcWritableBridge.readString(11, __dbResults);
    this.POSTCODE = JdbcWritableBridge.readString(12, __dbResults);
    this.X = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.Y = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.DX = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.DY = JdbcWritableBridge.readBigDecimal(16, __dbResults);
    this.KWX = JdbcWritableBridge.readBigDecimal(17, __dbResults);
    this.KWY = JdbcWritableBridge.readBigDecimal(18, __dbResults);
    this.KWDX = JdbcWritableBridge.readBigDecimal(19, __dbResults);
    this.KWDY = JdbcWritableBridge.readBigDecimal(20, __dbResults);
    this.POIMEMO = JdbcWritableBridge.readString(21, __dbResults);
    this.IMPORTANCE = JdbcWritableBridge.readString(22, __dbResults);
    this.POIFLAG = JdbcWritableBridge.readString(23, __dbResults);
    this.GDF_ENGLISHNAME = JdbcWritableBridge.readString(24, __dbResults);
    this.GDF_ORIGINENG = JdbcWritableBridge.readString(25, __dbResults);
    this.GDF_ENGCLASS = JdbcWritableBridge.readString(26, __dbResults);
    this.VANITYCITY = JdbcWritableBridge.readString(27, __dbResults);
    this.SAITEM = JdbcWritableBridge.readString(28, __dbResults);
    this.CHAIN = JdbcWritableBridge.readString(29, __dbResults);
    this.SIGHTLEVEL = JdbcWritableBridge.readString(30, __dbResults);
    this.STATE = JdbcWritableBridge.readString(31, __dbResults);
    this.LABEL = JdbcWritableBridge.readString(32, __dbResults);
    this.FATHERSON = JdbcWritableBridge.readString(33, __dbResults);
    this.LOG = JdbcWritableBridge.readString(34, __dbResults);
    this.ALIASNAME = JdbcWritableBridge.readString(35, __dbResults);
    this.ALIASPY = JdbcWritableBridge.readString(36, __dbResults);
    this.POIASSOCIATION = JdbcWritableBridge.readString(37, __dbResults);
    this.FOODTYPE = JdbcWritableBridge.readString(38, __dbResults);
    this.MENUNAME = JdbcWritableBridge.readString(39, __dbResults);
    this.POIADDRESS = JdbcWritableBridge.readString(40, __dbResults);
    this.ADDRCOMEFROM = JdbcWritableBridge.readString(41, __dbResults);
    this.OLDADDRESS = JdbcWritableBridge.readString(42, __dbResults);
    this.OPENING24 = JdbcWritableBridge.readString(43, __dbResults);
    this.PID = JdbcWritableBridge.readString(44, __dbResults);
    this.POIKIND2 = JdbcWritableBridge.readString(45, __dbResults);
    this.POIKINDOTHER = JdbcWritableBridge.readString(46, __dbResults);
    this.LINK_PID = JdbcWritableBridge.readString(47, __dbResults);
    this.HOTEL_RATING = JdbcWritableBridge.readString(48, __dbResults);
    this.ADMINAREACODE_15AUT = JdbcWritableBridge.readString(49, __dbResults);
    this.POI_LEVEL = JdbcWritableBridge.readString(50, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.MESHID3 = JdbcWritableBridge.readString(1, __dbResults);
    this.OLDNUM = JdbcWritableBridge.readString(2, __dbResults);
    this.POINUM = JdbcWritableBridge.readString(3, __dbResults);
    this.POIKIND = JdbcWritableBridge.readString(4, __dbResults);
    this.OLDNAME = JdbcWritableBridge.readString(5, __dbResults);
    this.POINAME = JdbcWritableBridge.readString(6, __dbResults);
    this.POIPY = JdbcWritableBridge.readString(7, __dbResults);
    this.ADMINAREACODE = JdbcWritableBridge.readString(8, __dbResults);
    this.BLOCKCODE = JdbcWritableBridge.readString(9, __dbResults);
    this.TELEPHONE = JdbcWritableBridge.readString(10, __dbResults);
    this.TELETYPE = JdbcWritableBridge.readString(11, __dbResults);
    this.POSTCODE = JdbcWritableBridge.readString(12, __dbResults);
    this.X = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.Y = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.DX = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.DY = JdbcWritableBridge.readBigDecimal(16, __dbResults);
    this.KWX = JdbcWritableBridge.readBigDecimal(17, __dbResults);
    this.KWY = JdbcWritableBridge.readBigDecimal(18, __dbResults);
    this.KWDX = JdbcWritableBridge.readBigDecimal(19, __dbResults);
    this.KWDY = JdbcWritableBridge.readBigDecimal(20, __dbResults);
    this.POIMEMO = JdbcWritableBridge.readString(21, __dbResults);
    this.IMPORTANCE = JdbcWritableBridge.readString(22, __dbResults);
    this.POIFLAG = JdbcWritableBridge.readString(23, __dbResults);
    this.GDF_ENGLISHNAME = JdbcWritableBridge.readString(24, __dbResults);
    this.GDF_ORIGINENG = JdbcWritableBridge.readString(25, __dbResults);
    this.GDF_ENGCLASS = JdbcWritableBridge.readString(26, __dbResults);
    this.VANITYCITY = JdbcWritableBridge.readString(27, __dbResults);
    this.SAITEM = JdbcWritableBridge.readString(28, __dbResults);
    this.CHAIN = JdbcWritableBridge.readString(29, __dbResults);
    this.SIGHTLEVEL = JdbcWritableBridge.readString(30, __dbResults);
    this.STATE = JdbcWritableBridge.readString(31, __dbResults);
    this.LABEL = JdbcWritableBridge.readString(32, __dbResults);
    this.FATHERSON = JdbcWritableBridge.readString(33, __dbResults);
    this.LOG = JdbcWritableBridge.readString(34, __dbResults);
    this.ALIASNAME = JdbcWritableBridge.readString(35, __dbResults);
    this.ALIASPY = JdbcWritableBridge.readString(36, __dbResults);
    this.POIASSOCIATION = JdbcWritableBridge.readString(37, __dbResults);
    this.FOODTYPE = JdbcWritableBridge.readString(38, __dbResults);
    this.MENUNAME = JdbcWritableBridge.readString(39, __dbResults);
    this.POIADDRESS = JdbcWritableBridge.readString(40, __dbResults);
    this.ADDRCOMEFROM = JdbcWritableBridge.readString(41, __dbResults);
    this.OLDADDRESS = JdbcWritableBridge.readString(42, __dbResults);
    this.OPENING24 = JdbcWritableBridge.readString(43, __dbResults);
    this.PID = JdbcWritableBridge.readString(44, __dbResults);
    this.POIKIND2 = JdbcWritableBridge.readString(45, __dbResults);
    this.POIKINDOTHER = JdbcWritableBridge.readString(46, __dbResults);
    this.LINK_PID = JdbcWritableBridge.readString(47, __dbResults);
    this.HOTEL_RATING = JdbcWritableBridge.readString(48, __dbResults);
    this.ADMINAREACODE_15AUT = JdbcWritableBridge.readString(49, __dbResults);
    this.POI_LEVEL = JdbcWritableBridge.readString(50, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void loadLargeObjects0(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(MESHID3, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(OLDNUM, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(POINUM, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(POIKIND, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(OLDNAME, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(POINAME, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(POIPY, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ADMINAREACODE, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(BLOCKCODE, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(TELEPHONE, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(TELETYPE, 11 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(POSTCODE, 12 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(X, 13 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Y, 14 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DX, 15 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DY, 16 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(KWX, 17 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(KWY, 18 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(KWDX, 19 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(KWDY, 20 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(POIMEMO, 21 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(IMPORTANCE, 22 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(POIFLAG, 23 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(GDF_ENGLISHNAME, 24 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(GDF_ORIGINENG, 25 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(GDF_ENGCLASS, 26 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(VANITYCITY, 27 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(SAITEM, 28 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CHAIN, 29 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(SIGHTLEVEL, 30 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(STATE, 31 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(LABEL, 32 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(FATHERSON, 33 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(LOG, 34 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ALIASNAME, 35 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ALIASPY, 36 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(POIASSOCIATION, 37 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(FOODTYPE, 38 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(MENUNAME, 39 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(POIADDRESS, 40 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ADDRCOMEFROM, 41 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(OLDADDRESS, 42 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(OPENING24, 43 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(PID, 44 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(POIKIND2, 45 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(POIKINDOTHER, 46 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(LINK_PID, 47 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(HOTEL_RATING, 48 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ADMINAREACODE_15AUT, 49 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(POI_LEVEL, 50 + __off, 12, __dbStmt);
    return 50;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(MESHID3, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(OLDNUM, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(POINUM, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(POIKIND, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(OLDNAME, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(POINAME, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(POIPY, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ADMINAREACODE, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(BLOCKCODE, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(TELEPHONE, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(TELETYPE, 11 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(POSTCODE, 12 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(X, 13 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Y, 14 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DX, 15 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DY, 16 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(KWX, 17 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(KWY, 18 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(KWDX, 19 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(KWDY, 20 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(POIMEMO, 21 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(IMPORTANCE, 22 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(POIFLAG, 23 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(GDF_ENGLISHNAME, 24 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(GDF_ORIGINENG, 25 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(GDF_ENGCLASS, 26 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(VANITYCITY, 27 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(SAITEM, 28 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CHAIN, 29 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(SIGHTLEVEL, 30 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(STATE, 31 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(LABEL, 32 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(FATHERSON, 33 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(LOG, 34 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ALIASNAME, 35 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ALIASPY, 36 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(POIASSOCIATION, 37 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(FOODTYPE, 38 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(MENUNAME, 39 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(POIADDRESS, 40 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ADDRCOMEFROM, 41 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(OLDADDRESS, 42 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(OPENING24, 43 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(PID, 44 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(POIKIND2, 45 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(POIKINDOTHER, 46 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(LINK_PID, 47 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(HOTEL_RATING, 48 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ADMINAREACODE_15AUT, 49 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(POI_LEVEL, 50 + __off, 12, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.MESHID3 = null;
    } else {
    this.MESHID3 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.OLDNUM = null;
    } else {
    this.OLDNUM = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.POINUM = null;
    } else {
    this.POINUM = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.POIKIND = null;
    } else {
    this.POIKIND = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.OLDNAME = null;
    } else {
    this.OLDNAME = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.POINAME = null;
    } else {
    this.POINAME = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.POIPY = null;
    } else {
    this.POIPY = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ADMINAREACODE = null;
    } else {
    this.ADMINAREACODE = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.BLOCKCODE = null;
    } else {
    this.BLOCKCODE = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.TELEPHONE = null;
    } else {
    this.TELEPHONE = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.TELETYPE = null;
    } else {
    this.TELETYPE = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.POSTCODE = null;
    } else {
    this.POSTCODE = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.X = null;
    } else {
    this.X = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Y = null;
    } else {
    this.Y = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DX = null;
    } else {
    this.DX = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DY = null;
    } else {
    this.DY = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.KWX = null;
    } else {
    this.KWX = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.KWY = null;
    } else {
    this.KWY = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.KWDX = null;
    } else {
    this.KWDX = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.KWDY = null;
    } else {
    this.KWDY = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.POIMEMO = null;
    } else {
    this.POIMEMO = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.IMPORTANCE = null;
    } else {
    this.IMPORTANCE = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.POIFLAG = null;
    } else {
    this.POIFLAG = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.GDF_ENGLISHNAME = null;
    } else {
    this.GDF_ENGLISHNAME = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.GDF_ORIGINENG = null;
    } else {
    this.GDF_ORIGINENG = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.GDF_ENGCLASS = null;
    } else {
    this.GDF_ENGCLASS = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.VANITYCITY = null;
    } else {
    this.VANITYCITY = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.SAITEM = null;
    } else {
    this.SAITEM = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CHAIN = null;
    } else {
    this.CHAIN = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.SIGHTLEVEL = null;
    } else {
    this.SIGHTLEVEL = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.STATE = null;
    } else {
    this.STATE = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.LABEL = null;
    } else {
    this.LABEL = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.FATHERSON = null;
    } else {
    this.FATHERSON = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.LOG = null;
    } else {
    this.LOG = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ALIASNAME = null;
    } else {
    this.ALIASNAME = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ALIASPY = null;
    } else {
    this.ALIASPY = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.POIASSOCIATION = null;
    } else {
    this.POIASSOCIATION = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.FOODTYPE = null;
    } else {
    this.FOODTYPE = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.MENUNAME = null;
    } else {
    this.MENUNAME = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.POIADDRESS = null;
    } else {
    this.POIADDRESS = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ADDRCOMEFROM = null;
    } else {
    this.ADDRCOMEFROM = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.OLDADDRESS = null;
    } else {
    this.OLDADDRESS = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.OPENING24 = null;
    } else {
    this.OPENING24 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.PID = null;
    } else {
    this.PID = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.POIKIND2 = null;
    } else {
    this.POIKIND2 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.POIKINDOTHER = null;
    } else {
    this.POIKINDOTHER = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.LINK_PID = null;
    } else {
    this.LINK_PID = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.HOTEL_RATING = null;
    } else {
    this.HOTEL_RATING = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ADMINAREACODE_15AUT = null;
    } else {
    this.ADMINAREACODE_15AUT = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.POI_LEVEL = null;
    } else {
    this.POI_LEVEL = Text.readString(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.MESHID3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, MESHID3);
    }
    if (null == this.OLDNUM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, OLDNUM);
    }
    if (null == this.POINUM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, POINUM);
    }
    if (null == this.POIKIND) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, POIKIND);
    }
    if (null == this.OLDNAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, OLDNAME);
    }
    if (null == this.POINAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, POINAME);
    }
    if (null == this.POIPY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, POIPY);
    }
    if (null == this.ADMINAREACODE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ADMINAREACODE);
    }
    if (null == this.BLOCKCODE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, BLOCKCODE);
    }
    if (null == this.TELEPHONE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, TELEPHONE);
    }
    if (null == this.TELETYPE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, TELETYPE);
    }
    if (null == this.POSTCODE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, POSTCODE);
    }
    if (null == this.X) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.X, __dataOut);
    }
    if (null == this.Y) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.Y, __dataOut);
    }
    if (null == this.DX) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DX, __dataOut);
    }
    if (null == this.DY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DY, __dataOut);
    }
    if (null == this.KWX) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.KWX, __dataOut);
    }
    if (null == this.KWY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.KWY, __dataOut);
    }
    if (null == this.KWDX) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.KWDX, __dataOut);
    }
    if (null == this.KWDY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.KWDY, __dataOut);
    }
    if (null == this.POIMEMO) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, POIMEMO);
    }
    if (null == this.IMPORTANCE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, IMPORTANCE);
    }
    if (null == this.POIFLAG) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, POIFLAG);
    }
    if (null == this.GDF_ENGLISHNAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, GDF_ENGLISHNAME);
    }
    if (null == this.GDF_ORIGINENG) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, GDF_ORIGINENG);
    }
    if (null == this.GDF_ENGCLASS) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, GDF_ENGCLASS);
    }
    if (null == this.VANITYCITY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, VANITYCITY);
    }
    if (null == this.SAITEM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, SAITEM);
    }
    if (null == this.CHAIN) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CHAIN);
    }
    if (null == this.SIGHTLEVEL) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, SIGHTLEVEL);
    }
    if (null == this.STATE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, STATE);
    }
    if (null == this.LABEL) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LABEL);
    }
    if (null == this.FATHERSON) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FATHERSON);
    }
    if (null == this.LOG) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LOG);
    }
    if (null == this.ALIASNAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ALIASNAME);
    }
    if (null == this.ALIASPY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ALIASPY);
    }
    if (null == this.POIASSOCIATION) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, POIASSOCIATION);
    }
    if (null == this.FOODTYPE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FOODTYPE);
    }
    if (null == this.MENUNAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, MENUNAME);
    }
    if (null == this.POIADDRESS) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, POIADDRESS);
    }
    if (null == this.ADDRCOMEFROM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ADDRCOMEFROM);
    }
    if (null == this.OLDADDRESS) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, OLDADDRESS);
    }
    if (null == this.OPENING24) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, OPENING24);
    }
    if (null == this.PID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, PID);
    }
    if (null == this.POIKIND2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, POIKIND2);
    }
    if (null == this.POIKINDOTHER) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, POIKINDOTHER);
    }
    if (null == this.LINK_PID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LINK_PID);
    }
    if (null == this.HOTEL_RATING) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, HOTEL_RATING);
    }
    if (null == this.ADMINAREACODE_15AUT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ADMINAREACODE_15AUT);
    }
    if (null == this.POI_LEVEL) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, POI_LEVEL);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.MESHID3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, MESHID3);
    }
    if (null == this.OLDNUM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, OLDNUM);
    }
    if (null == this.POINUM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, POINUM);
    }
    if (null == this.POIKIND) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, POIKIND);
    }
    if (null == this.OLDNAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, OLDNAME);
    }
    if (null == this.POINAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, POINAME);
    }
    if (null == this.POIPY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, POIPY);
    }
    if (null == this.ADMINAREACODE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ADMINAREACODE);
    }
    if (null == this.BLOCKCODE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, BLOCKCODE);
    }
    if (null == this.TELEPHONE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, TELEPHONE);
    }
    if (null == this.TELETYPE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, TELETYPE);
    }
    if (null == this.POSTCODE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, POSTCODE);
    }
    if (null == this.X) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.X, __dataOut);
    }
    if (null == this.Y) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.Y, __dataOut);
    }
    if (null == this.DX) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DX, __dataOut);
    }
    if (null == this.DY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DY, __dataOut);
    }
    if (null == this.KWX) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.KWX, __dataOut);
    }
    if (null == this.KWY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.KWY, __dataOut);
    }
    if (null == this.KWDX) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.KWDX, __dataOut);
    }
    if (null == this.KWDY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.KWDY, __dataOut);
    }
    if (null == this.POIMEMO) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, POIMEMO);
    }
    if (null == this.IMPORTANCE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, IMPORTANCE);
    }
    if (null == this.POIFLAG) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, POIFLAG);
    }
    if (null == this.GDF_ENGLISHNAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, GDF_ENGLISHNAME);
    }
    if (null == this.GDF_ORIGINENG) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, GDF_ORIGINENG);
    }
    if (null == this.GDF_ENGCLASS) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, GDF_ENGCLASS);
    }
    if (null == this.VANITYCITY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, VANITYCITY);
    }
    if (null == this.SAITEM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, SAITEM);
    }
    if (null == this.CHAIN) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CHAIN);
    }
    if (null == this.SIGHTLEVEL) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, SIGHTLEVEL);
    }
    if (null == this.STATE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, STATE);
    }
    if (null == this.LABEL) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LABEL);
    }
    if (null == this.FATHERSON) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FATHERSON);
    }
    if (null == this.LOG) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LOG);
    }
    if (null == this.ALIASNAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ALIASNAME);
    }
    if (null == this.ALIASPY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ALIASPY);
    }
    if (null == this.POIASSOCIATION) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, POIASSOCIATION);
    }
    if (null == this.FOODTYPE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FOODTYPE);
    }
    if (null == this.MENUNAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, MENUNAME);
    }
    if (null == this.POIADDRESS) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, POIADDRESS);
    }
    if (null == this.ADDRCOMEFROM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ADDRCOMEFROM);
    }
    if (null == this.OLDADDRESS) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, OLDADDRESS);
    }
    if (null == this.OPENING24) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, OPENING24);
    }
    if (null == this.PID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, PID);
    }
    if (null == this.POIKIND2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, POIKIND2);
    }
    if (null == this.POIKINDOTHER) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, POIKINDOTHER);
    }
    if (null == this.LINK_PID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LINK_PID);
    }
    if (null == this.HOTEL_RATING) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, HOTEL_RATING);
    }
    if (null == this.ADMINAREACODE_15AUT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ADMINAREACODE_15AUT);
    }
    if (null == this.POI_LEVEL) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, POI_LEVEL);
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  public String toString() {
    return toString(__outputDelimiters, true);
  }
  public String toString(DelimiterSet delimiters) {
    return toString(delimiters, true);
  }
  public String toString(boolean useRecordDelim) {
    return toString(__outputDelimiters, useRecordDelim);
  }
  public String toString(DelimiterSet delimiters, boolean useRecordDelim) {
    StringBuilder __sb = new StringBuilder();
    char fieldDelim = delimiters.getFieldsTerminatedBy();
    __sb.append(FieldFormatter.escapeAndEnclose(MESHID3==null?"null":MESHID3, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(OLDNUM==null?"null":OLDNUM, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(POINUM==null?"null":POINUM, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(POIKIND==null?"null":POIKIND, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(OLDNAME==null?"null":OLDNAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(POINAME==null?"null":POINAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(POIPY==null?"null":POIPY, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ADMINAREACODE==null?"null":ADMINAREACODE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(BLOCKCODE==null?"null":BLOCKCODE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TELEPHONE==null?"null":TELEPHONE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TELETYPE==null?"null":TELETYPE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(POSTCODE==null?"null":POSTCODE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(X==null?"null":X.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y==null?"null":Y.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DX==null?"null":DX.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DY==null?"null":DY.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(KWX==null?"null":KWX.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(KWY==null?"null":KWY.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(KWDX==null?"null":KWDX.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(KWDY==null?"null":KWDY.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(POIMEMO==null?"null":POIMEMO, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(IMPORTANCE==null?"null":IMPORTANCE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(POIFLAG==null?"null":POIFLAG, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(GDF_ENGLISHNAME==null?"null":GDF_ENGLISHNAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(GDF_ORIGINENG==null?"null":GDF_ORIGINENG, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(GDF_ENGCLASS==null?"null":GDF_ENGCLASS, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(VANITYCITY==null?"null":VANITYCITY, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SAITEM==null?"null":SAITEM, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CHAIN==null?"null":CHAIN, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SIGHTLEVEL==null?"null":SIGHTLEVEL, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(STATE==null?"null":STATE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LABEL==null?"null":LABEL, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FATHERSON==null?"null":FATHERSON, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LOG==null?"null":LOG, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ALIASNAME==null?"null":ALIASNAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ALIASPY==null?"null":ALIASPY, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(POIASSOCIATION==null?"null":POIASSOCIATION, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FOODTYPE==null?"null":FOODTYPE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(MENUNAME==null?"null":MENUNAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(POIADDRESS==null?"null":POIADDRESS, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ADDRCOMEFROM==null?"null":ADDRCOMEFROM, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(OLDADDRESS==null?"null":OLDADDRESS, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(OPENING24==null?"null":OPENING24, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PID==null?"null":PID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(POIKIND2==null?"null":POIKIND2, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(POIKINDOTHER==null?"null":POIKINDOTHER, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LINK_PID==null?"null":LINK_PID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(HOTEL_RATING==null?"null":HOTEL_RATING, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ADMINAREACODE_15AUT==null?"null":ADMINAREACODE_15AUT, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(POI_LEVEL==null?"null":POI_LEVEL, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(MESHID3==null?"null":MESHID3, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(OLDNUM==null?"null":OLDNUM, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(POINUM==null?"null":POINUM, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(POIKIND==null?"null":POIKIND, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(OLDNAME==null?"null":OLDNAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(POINAME==null?"null":POINAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(POIPY==null?"null":POIPY, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ADMINAREACODE==null?"null":ADMINAREACODE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(BLOCKCODE==null?"null":BLOCKCODE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TELEPHONE==null?"null":TELEPHONE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TELETYPE==null?"null":TELETYPE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(POSTCODE==null?"null":POSTCODE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(X==null?"null":X.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Y==null?"null":Y.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DX==null?"null":DX.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DY==null?"null":DY.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(KWX==null?"null":KWX.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(KWY==null?"null":KWY.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(KWDX==null?"null":KWDX.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(KWDY==null?"null":KWDY.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(POIMEMO==null?"null":POIMEMO, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(IMPORTANCE==null?"null":IMPORTANCE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(POIFLAG==null?"null":POIFLAG, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(GDF_ENGLISHNAME==null?"null":GDF_ENGLISHNAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(GDF_ORIGINENG==null?"null":GDF_ORIGINENG, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(GDF_ENGCLASS==null?"null":GDF_ENGCLASS, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(VANITYCITY==null?"null":VANITYCITY, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SAITEM==null?"null":SAITEM, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CHAIN==null?"null":CHAIN, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SIGHTLEVEL==null?"null":SIGHTLEVEL, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(STATE==null?"null":STATE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LABEL==null?"null":LABEL, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FATHERSON==null?"null":FATHERSON, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LOG==null?"null":LOG, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ALIASNAME==null?"null":ALIASNAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ALIASPY==null?"null":ALIASPY, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(POIASSOCIATION==null?"null":POIASSOCIATION, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FOODTYPE==null?"null":FOODTYPE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(MENUNAME==null?"null":MENUNAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(POIADDRESS==null?"null":POIADDRESS, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ADDRCOMEFROM==null?"null":ADDRCOMEFROM, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(OLDADDRESS==null?"null":OLDADDRESS, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(OPENING24==null?"null":OPENING24, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PID==null?"null":PID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(POIKIND2==null?"null":POIKIND2, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(POIKINDOTHER==null?"null":POIKINDOTHER, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LINK_PID==null?"null":LINK_PID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(HOTEL_RATING==null?"null":HOTEL_RATING, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ADMINAREACODE_15AUT==null?"null":ADMINAREACODE_15AUT, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(POI_LEVEL==null?"null":POI_LEVEL, delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  private RecordParser __parser;
  public void parse(Text __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharSequence __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(byte [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(char [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(ByteBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  private void __loadFromFields(List<String> fields) {
    Iterator<String> __it = fields.listIterator();
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.MESHID3 = null; } else {
      this.MESHID3 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.OLDNUM = null; } else {
      this.OLDNUM = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.POINUM = null; } else {
      this.POINUM = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.POIKIND = null; } else {
      this.POIKIND = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.OLDNAME = null; } else {
      this.OLDNAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.POINAME = null; } else {
      this.POINAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.POIPY = null; } else {
      this.POIPY = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ADMINAREACODE = null; } else {
      this.ADMINAREACODE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.BLOCKCODE = null; } else {
      this.BLOCKCODE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.TELEPHONE = null; } else {
      this.TELEPHONE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.TELETYPE = null; } else {
      this.TELETYPE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.POSTCODE = null; } else {
      this.POSTCODE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.X = null; } else {
      this.X = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y = null; } else {
      this.Y = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DX = null; } else {
      this.DX = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DY = null; } else {
      this.DY = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.KWX = null; } else {
      this.KWX = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.KWY = null; } else {
      this.KWY = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.KWDX = null; } else {
      this.KWDX = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.KWDY = null; } else {
      this.KWDY = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.POIMEMO = null; } else {
      this.POIMEMO = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.IMPORTANCE = null; } else {
      this.IMPORTANCE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.POIFLAG = null; } else {
      this.POIFLAG = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.GDF_ENGLISHNAME = null; } else {
      this.GDF_ENGLISHNAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.GDF_ORIGINENG = null; } else {
      this.GDF_ORIGINENG = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.GDF_ENGCLASS = null; } else {
      this.GDF_ENGCLASS = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.VANITYCITY = null; } else {
      this.VANITYCITY = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.SAITEM = null; } else {
      this.SAITEM = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CHAIN = null; } else {
      this.CHAIN = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.SIGHTLEVEL = null; } else {
      this.SIGHTLEVEL = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.STATE = null; } else {
      this.STATE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.LABEL = null; } else {
      this.LABEL = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.FATHERSON = null; } else {
      this.FATHERSON = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.LOG = null; } else {
      this.LOG = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ALIASNAME = null; } else {
      this.ALIASNAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ALIASPY = null; } else {
      this.ALIASPY = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.POIASSOCIATION = null; } else {
      this.POIASSOCIATION = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.FOODTYPE = null; } else {
      this.FOODTYPE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.MENUNAME = null; } else {
      this.MENUNAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.POIADDRESS = null; } else {
      this.POIADDRESS = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ADDRCOMEFROM = null; } else {
      this.ADDRCOMEFROM = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.OLDADDRESS = null; } else {
      this.OLDADDRESS = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.OPENING24 = null; } else {
      this.OPENING24 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.PID = null; } else {
      this.PID = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.POIKIND2 = null; } else {
      this.POIKIND2 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.POIKINDOTHER = null; } else {
      this.POIKINDOTHER = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.LINK_PID = null; } else {
      this.LINK_PID = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.HOTEL_RATING = null; } else {
      this.HOTEL_RATING = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ADMINAREACODE_15AUT = null; } else {
      this.ADMINAREACODE_15AUT = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.POI_LEVEL = null; } else {
      this.POI_LEVEL = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.MESHID3 = null; } else {
      this.MESHID3 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.OLDNUM = null; } else {
      this.OLDNUM = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.POINUM = null; } else {
      this.POINUM = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.POIKIND = null; } else {
      this.POIKIND = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.OLDNAME = null; } else {
      this.OLDNAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.POINAME = null; } else {
      this.POINAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.POIPY = null; } else {
      this.POIPY = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ADMINAREACODE = null; } else {
      this.ADMINAREACODE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.BLOCKCODE = null; } else {
      this.BLOCKCODE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.TELEPHONE = null; } else {
      this.TELEPHONE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.TELETYPE = null; } else {
      this.TELETYPE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.POSTCODE = null; } else {
      this.POSTCODE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.X = null; } else {
      this.X = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Y = null; } else {
      this.Y = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DX = null; } else {
      this.DX = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DY = null; } else {
      this.DY = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.KWX = null; } else {
      this.KWX = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.KWY = null; } else {
      this.KWY = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.KWDX = null; } else {
      this.KWDX = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.KWDY = null; } else {
      this.KWDY = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.POIMEMO = null; } else {
      this.POIMEMO = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.IMPORTANCE = null; } else {
      this.IMPORTANCE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.POIFLAG = null; } else {
      this.POIFLAG = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.GDF_ENGLISHNAME = null; } else {
      this.GDF_ENGLISHNAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.GDF_ORIGINENG = null; } else {
      this.GDF_ORIGINENG = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.GDF_ENGCLASS = null; } else {
      this.GDF_ENGCLASS = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.VANITYCITY = null; } else {
      this.VANITYCITY = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.SAITEM = null; } else {
      this.SAITEM = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CHAIN = null; } else {
      this.CHAIN = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.SIGHTLEVEL = null; } else {
      this.SIGHTLEVEL = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.STATE = null; } else {
      this.STATE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.LABEL = null; } else {
      this.LABEL = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.FATHERSON = null; } else {
      this.FATHERSON = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.LOG = null; } else {
      this.LOG = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ALIASNAME = null; } else {
      this.ALIASNAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ALIASPY = null; } else {
      this.ALIASPY = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.POIASSOCIATION = null; } else {
      this.POIASSOCIATION = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.FOODTYPE = null; } else {
      this.FOODTYPE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.MENUNAME = null; } else {
      this.MENUNAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.POIADDRESS = null; } else {
      this.POIADDRESS = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ADDRCOMEFROM = null; } else {
      this.ADDRCOMEFROM = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.OLDADDRESS = null; } else {
      this.OLDADDRESS = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.OPENING24 = null; } else {
      this.OPENING24 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.PID = null; } else {
      this.PID = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.POIKIND2 = null; } else {
      this.POIKIND2 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.POIKINDOTHER = null; } else {
      this.POIKINDOTHER = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.LINK_PID = null; } else {
      this.LINK_PID = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.HOTEL_RATING = null; } else {
      this.HOTEL_RATING = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ADMINAREACODE_15AUT = null; } else {
      this.ADMINAREACODE_15AUT = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.POI_LEVEL = null; } else {
      this.POI_LEVEL = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    QueryResult o = (QueryResult) super.clone();
    return o;
  }

  public void clone0(QueryResult o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("MESHID3", this.MESHID3);
    __sqoop$field_map.put("OLDNUM", this.OLDNUM);
    __sqoop$field_map.put("POINUM", this.POINUM);
    __sqoop$field_map.put("POIKIND", this.POIKIND);
    __sqoop$field_map.put("OLDNAME", this.OLDNAME);
    __sqoop$field_map.put("POINAME", this.POINAME);
    __sqoop$field_map.put("POIPY", this.POIPY);
    __sqoop$field_map.put("ADMINAREACODE", this.ADMINAREACODE);
    __sqoop$field_map.put("BLOCKCODE", this.BLOCKCODE);
    __sqoop$field_map.put("TELEPHONE", this.TELEPHONE);
    __sqoop$field_map.put("TELETYPE", this.TELETYPE);
    __sqoop$field_map.put("POSTCODE", this.POSTCODE);
    __sqoop$field_map.put("X", this.X);
    __sqoop$field_map.put("Y", this.Y);
    __sqoop$field_map.put("DX", this.DX);
    __sqoop$field_map.put("DY", this.DY);
    __sqoop$field_map.put("KWX", this.KWX);
    __sqoop$field_map.put("KWY", this.KWY);
    __sqoop$field_map.put("KWDX", this.KWDX);
    __sqoop$field_map.put("KWDY", this.KWDY);
    __sqoop$field_map.put("POIMEMO", this.POIMEMO);
    __sqoop$field_map.put("IMPORTANCE", this.IMPORTANCE);
    __sqoop$field_map.put("POIFLAG", this.POIFLAG);
    __sqoop$field_map.put("GDF_ENGLISHNAME", this.GDF_ENGLISHNAME);
    __sqoop$field_map.put("GDF_ORIGINENG", this.GDF_ORIGINENG);
    __sqoop$field_map.put("GDF_ENGCLASS", this.GDF_ENGCLASS);
    __sqoop$field_map.put("VANITYCITY", this.VANITYCITY);
    __sqoop$field_map.put("SAITEM", this.SAITEM);
    __sqoop$field_map.put("CHAIN", this.CHAIN);
    __sqoop$field_map.put("SIGHTLEVEL", this.SIGHTLEVEL);
    __sqoop$field_map.put("STATE", this.STATE);
    __sqoop$field_map.put("LABEL", this.LABEL);
    __sqoop$field_map.put("FATHERSON", this.FATHERSON);
    __sqoop$field_map.put("LOG", this.LOG);
    __sqoop$field_map.put("ALIASNAME", this.ALIASNAME);
    __sqoop$field_map.put("ALIASPY", this.ALIASPY);
    __sqoop$field_map.put("POIASSOCIATION", this.POIASSOCIATION);
    __sqoop$field_map.put("FOODTYPE", this.FOODTYPE);
    __sqoop$field_map.put("MENUNAME", this.MENUNAME);
    __sqoop$field_map.put("POIADDRESS", this.POIADDRESS);
    __sqoop$field_map.put("ADDRCOMEFROM", this.ADDRCOMEFROM);
    __sqoop$field_map.put("OLDADDRESS", this.OLDADDRESS);
    __sqoop$field_map.put("OPENING24", this.OPENING24);
    __sqoop$field_map.put("PID", this.PID);
    __sqoop$field_map.put("POIKIND2", this.POIKIND2);
    __sqoop$field_map.put("POIKINDOTHER", this.POIKINDOTHER);
    __sqoop$field_map.put("LINK_PID", this.LINK_PID);
    __sqoop$field_map.put("HOTEL_RATING", this.HOTEL_RATING);
    __sqoop$field_map.put("ADMINAREACODE_15AUT", this.ADMINAREACODE_15AUT);
    __sqoop$field_map.put("POI_LEVEL", this.POI_LEVEL);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("MESHID3", this.MESHID3);
    __sqoop$field_map.put("OLDNUM", this.OLDNUM);
    __sqoop$field_map.put("POINUM", this.POINUM);
    __sqoop$field_map.put("POIKIND", this.POIKIND);
    __sqoop$field_map.put("OLDNAME", this.OLDNAME);
    __sqoop$field_map.put("POINAME", this.POINAME);
    __sqoop$field_map.put("POIPY", this.POIPY);
    __sqoop$field_map.put("ADMINAREACODE", this.ADMINAREACODE);
    __sqoop$field_map.put("BLOCKCODE", this.BLOCKCODE);
    __sqoop$field_map.put("TELEPHONE", this.TELEPHONE);
    __sqoop$field_map.put("TELETYPE", this.TELETYPE);
    __sqoop$field_map.put("POSTCODE", this.POSTCODE);
    __sqoop$field_map.put("X", this.X);
    __sqoop$field_map.put("Y", this.Y);
    __sqoop$field_map.put("DX", this.DX);
    __sqoop$field_map.put("DY", this.DY);
    __sqoop$field_map.put("KWX", this.KWX);
    __sqoop$field_map.put("KWY", this.KWY);
    __sqoop$field_map.put("KWDX", this.KWDX);
    __sqoop$field_map.put("KWDY", this.KWDY);
    __sqoop$field_map.put("POIMEMO", this.POIMEMO);
    __sqoop$field_map.put("IMPORTANCE", this.IMPORTANCE);
    __sqoop$field_map.put("POIFLAG", this.POIFLAG);
    __sqoop$field_map.put("GDF_ENGLISHNAME", this.GDF_ENGLISHNAME);
    __sqoop$field_map.put("GDF_ORIGINENG", this.GDF_ORIGINENG);
    __sqoop$field_map.put("GDF_ENGCLASS", this.GDF_ENGCLASS);
    __sqoop$field_map.put("VANITYCITY", this.VANITYCITY);
    __sqoop$field_map.put("SAITEM", this.SAITEM);
    __sqoop$field_map.put("CHAIN", this.CHAIN);
    __sqoop$field_map.put("SIGHTLEVEL", this.SIGHTLEVEL);
    __sqoop$field_map.put("STATE", this.STATE);
    __sqoop$field_map.put("LABEL", this.LABEL);
    __sqoop$field_map.put("FATHERSON", this.FATHERSON);
    __sqoop$field_map.put("LOG", this.LOG);
    __sqoop$field_map.put("ALIASNAME", this.ALIASNAME);
    __sqoop$field_map.put("ALIASPY", this.ALIASPY);
    __sqoop$field_map.put("POIASSOCIATION", this.POIASSOCIATION);
    __sqoop$field_map.put("FOODTYPE", this.FOODTYPE);
    __sqoop$field_map.put("MENUNAME", this.MENUNAME);
    __sqoop$field_map.put("POIADDRESS", this.POIADDRESS);
    __sqoop$field_map.put("ADDRCOMEFROM", this.ADDRCOMEFROM);
    __sqoop$field_map.put("OLDADDRESS", this.OLDADDRESS);
    __sqoop$field_map.put("OPENING24", this.OPENING24);
    __sqoop$field_map.put("PID", this.PID);
    __sqoop$field_map.put("POIKIND2", this.POIKIND2);
    __sqoop$field_map.put("POIKINDOTHER", this.POIKINDOTHER);
    __sqoop$field_map.put("LINK_PID", this.LINK_PID);
    __sqoop$field_map.put("HOTEL_RATING", this.HOTEL_RATING);
    __sqoop$field_map.put("ADMINAREACODE_15AUT", this.ADMINAREACODE_15AUT);
    __sqoop$field_map.put("POI_LEVEL", this.POI_LEVEL);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("MESHID3".equals(__fieldName)) {
      this.MESHID3 = (String) __fieldVal;
    }
    else    if ("OLDNUM".equals(__fieldName)) {
      this.OLDNUM = (String) __fieldVal;
    }
    else    if ("POINUM".equals(__fieldName)) {
      this.POINUM = (String) __fieldVal;
    }
    else    if ("POIKIND".equals(__fieldName)) {
      this.POIKIND = (String) __fieldVal;
    }
    else    if ("OLDNAME".equals(__fieldName)) {
      this.OLDNAME = (String) __fieldVal;
    }
    else    if ("POINAME".equals(__fieldName)) {
      this.POINAME = (String) __fieldVal;
    }
    else    if ("POIPY".equals(__fieldName)) {
      this.POIPY = (String) __fieldVal;
    }
    else    if ("ADMINAREACODE".equals(__fieldName)) {
      this.ADMINAREACODE = (String) __fieldVal;
    }
    else    if ("BLOCKCODE".equals(__fieldName)) {
      this.BLOCKCODE = (String) __fieldVal;
    }
    else    if ("TELEPHONE".equals(__fieldName)) {
      this.TELEPHONE = (String) __fieldVal;
    }
    else    if ("TELETYPE".equals(__fieldName)) {
      this.TELETYPE = (String) __fieldVal;
    }
    else    if ("POSTCODE".equals(__fieldName)) {
      this.POSTCODE = (String) __fieldVal;
    }
    else    if ("X".equals(__fieldName)) {
      this.X = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("Y".equals(__fieldName)) {
      this.Y = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("DX".equals(__fieldName)) {
      this.DX = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("DY".equals(__fieldName)) {
      this.DY = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("KWX".equals(__fieldName)) {
      this.KWX = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("KWY".equals(__fieldName)) {
      this.KWY = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("KWDX".equals(__fieldName)) {
      this.KWDX = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("KWDY".equals(__fieldName)) {
      this.KWDY = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("POIMEMO".equals(__fieldName)) {
      this.POIMEMO = (String) __fieldVal;
    }
    else    if ("IMPORTANCE".equals(__fieldName)) {
      this.IMPORTANCE = (String) __fieldVal;
    }
    else    if ("POIFLAG".equals(__fieldName)) {
      this.POIFLAG = (String) __fieldVal;
    }
    else    if ("GDF_ENGLISHNAME".equals(__fieldName)) {
      this.GDF_ENGLISHNAME = (String) __fieldVal;
    }
    else    if ("GDF_ORIGINENG".equals(__fieldName)) {
      this.GDF_ORIGINENG = (String) __fieldVal;
    }
    else    if ("GDF_ENGCLASS".equals(__fieldName)) {
      this.GDF_ENGCLASS = (String) __fieldVal;
    }
    else    if ("VANITYCITY".equals(__fieldName)) {
      this.VANITYCITY = (String) __fieldVal;
    }
    else    if ("SAITEM".equals(__fieldName)) {
      this.SAITEM = (String) __fieldVal;
    }
    else    if ("CHAIN".equals(__fieldName)) {
      this.CHAIN = (String) __fieldVal;
    }
    else    if ("SIGHTLEVEL".equals(__fieldName)) {
      this.SIGHTLEVEL = (String) __fieldVal;
    }
    else    if ("STATE".equals(__fieldName)) {
      this.STATE = (String) __fieldVal;
    }
    else    if ("LABEL".equals(__fieldName)) {
      this.LABEL = (String) __fieldVal;
    }
    else    if ("FATHERSON".equals(__fieldName)) {
      this.FATHERSON = (String) __fieldVal;
    }
    else    if ("LOG".equals(__fieldName)) {
      this.LOG = (String) __fieldVal;
    }
    else    if ("ALIASNAME".equals(__fieldName)) {
      this.ALIASNAME = (String) __fieldVal;
    }
    else    if ("ALIASPY".equals(__fieldName)) {
      this.ALIASPY = (String) __fieldVal;
    }
    else    if ("POIASSOCIATION".equals(__fieldName)) {
      this.POIASSOCIATION = (String) __fieldVal;
    }
    else    if ("FOODTYPE".equals(__fieldName)) {
      this.FOODTYPE = (String) __fieldVal;
    }
    else    if ("MENUNAME".equals(__fieldName)) {
      this.MENUNAME = (String) __fieldVal;
    }
    else    if ("POIADDRESS".equals(__fieldName)) {
      this.POIADDRESS = (String) __fieldVal;
    }
    else    if ("ADDRCOMEFROM".equals(__fieldName)) {
      this.ADDRCOMEFROM = (String) __fieldVal;
    }
    else    if ("OLDADDRESS".equals(__fieldName)) {
      this.OLDADDRESS = (String) __fieldVal;
    }
    else    if ("OPENING24".equals(__fieldName)) {
      this.OPENING24 = (String) __fieldVal;
    }
    else    if ("PID".equals(__fieldName)) {
      this.PID = (String) __fieldVal;
    }
    else    if ("POIKIND2".equals(__fieldName)) {
      this.POIKIND2 = (String) __fieldVal;
    }
    else    if ("POIKINDOTHER".equals(__fieldName)) {
      this.POIKINDOTHER = (String) __fieldVal;
    }
    else    if ("LINK_PID".equals(__fieldName)) {
      this.LINK_PID = (String) __fieldVal;
    }
    else    if ("HOTEL_RATING".equals(__fieldName)) {
      this.HOTEL_RATING = (String) __fieldVal;
    }
    else    if ("ADMINAREACODE_15AUT".equals(__fieldName)) {
      this.ADMINAREACODE_15AUT = (String) __fieldVal;
    }
    else    if ("POI_LEVEL".equals(__fieldName)) {
      this.POI_LEVEL = (String) __fieldVal;
    }
    else {
      throw new RuntimeException("No such field: " + __fieldName);
    }
  }
  public boolean setField0(String __fieldName, Object __fieldVal) {
    if ("MESHID3".equals(__fieldName)) {
      this.MESHID3 = (String) __fieldVal;
      return true;
    }
    else    if ("OLDNUM".equals(__fieldName)) {
      this.OLDNUM = (String) __fieldVal;
      return true;
    }
    else    if ("POINUM".equals(__fieldName)) {
      this.POINUM = (String) __fieldVal;
      return true;
    }
    else    if ("POIKIND".equals(__fieldName)) {
      this.POIKIND = (String) __fieldVal;
      return true;
    }
    else    if ("OLDNAME".equals(__fieldName)) {
      this.OLDNAME = (String) __fieldVal;
      return true;
    }
    else    if ("POINAME".equals(__fieldName)) {
      this.POINAME = (String) __fieldVal;
      return true;
    }
    else    if ("POIPY".equals(__fieldName)) {
      this.POIPY = (String) __fieldVal;
      return true;
    }
    else    if ("ADMINAREACODE".equals(__fieldName)) {
      this.ADMINAREACODE = (String) __fieldVal;
      return true;
    }
    else    if ("BLOCKCODE".equals(__fieldName)) {
      this.BLOCKCODE = (String) __fieldVal;
      return true;
    }
    else    if ("TELEPHONE".equals(__fieldName)) {
      this.TELEPHONE = (String) __fieldVal;
      return true;
    }
    else    if ("TELETYPE".equals(__fieldName)) {
      this.TELETYPE = (String) __fieldVal;
      return true;
    }
    else    if ("POSTCODE".equals(__fieldName)) {
      this.POSTCODE = (String) __fieldVal;
      return true;
    }
    else    if ("X".equals(__fieldName)) {
      this.X = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("Y".equals(__fieldName)) {
      this.Y = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("DX".equals(__fieldName)) {
      this.DX = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("DY".equals(__fieldName)) {
      this.DY = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("KWX".equals(__fieldName)) {
      this.KWX = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("KWY".equals(__fieldName)) {
      this.KWY = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("KWDX".equals(__fieldName)) {
      this.KWDX = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("KWDY".equals(__fieldName)) {
      this.KWDY = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("POIMEMO".equals(__fieldName)) {
      this.POIMEMO = (String) __fieldVal;
      return true;
    }
    else    if ("IMPORTANCE".equals(__fieldName)) {
      this.IMPORTANCE = (String) __fieldVal;
      return true;
    }
    else    if ("POIFLAG".equals(__fieldName)) {
      this.POIFLAG = (String) __fieldVal;
      return true;
    }
    else    if ("GDF_ENGLISHNAME".equals(__fieldName)) {
      this.GDF_ENGLISHNAME = (String) __fieldVal;
      return true;
    }
    else    if ("GDF_ORIGINENG".equals(__fieldName)) {
      this.GDF_ORIGINENG = (String) __fieldVal;
      return true;
    }
    else    if ("GDF_ENGCLASS".equals(__fieldName)) {
      this.GDF_ENGCLASS = (String) __fieldVal;
      return true;
    }
    else    if ("VANITYCITY".equals(__fieldName)) {
      this.VANITYCITY = (String) __fieldVal;
      return true;
    }
    else    if ("SAITEM".equals(__fieldName)) {
      this.SAITEM = (String) __fieldVal;
      return true;
    }
    else    if ("CHAIN".equals(__fieldName)) {
      this.CHAIN = (String) __fieldVal;
      return true;
    }
    else    if ("SIGHTLEVEL".equals(__fieldName)) {
      this.SIGHTLEVEL = (String) __fieldVal;
      return true;
    }
    else    if ("STATE".equals(__fieldName)) {
      this.STATE = (String) __fieldVal;
      return true;
    }
    else    if ("LABEL".equals(__fieldName)) {
      this.LABEL = (String) __fieldVal;
      return true;
    }
    else    if ("FATHERSON".equals(__fieldName)) {
      this.FATHERSON = (String) __fieldVal;
      return true;
    }
    else    if ("LOG".equals(__fieldName)) {
      this.LOG = (String) __fieldVal;
      return true;
    }
    else    if ("ALIASNAME".equals(__fieldName)) {
      this.ALIASNAME = (String) __fieldVal;
      return true;
    }
    else    if ("ALIASPY".equals(__fieldName)) {
      this.ALIASPY = (String) __fieldVal;
      return true;
    }
    else    if ("POIASSOCIATION".equals(__fieldName)) {
      this.POIASSOCIATION = (String) __fieldVal;
      return true;
    }
    else    if ("FOODTYPE".equals(__fieldName)) {
      this.FOODTYPE = (String) __fieldVal;
      return true;
    }
    else    if ("MENUNAME".equals(__fieldName)) {
      this.MENUNAME = (String) __fieldVal;
      return true;
    }
    else    if ("POIADDRESS".equals(__fieldName)) {
      this.POIADDRESS = (String) __fieldVal;
      return true;
    }
    else    if ("ADDRCOMEFROM".equals(__fieldName)) {
      this.ADDRCOMEFROM = (String) __fieldVal;
      return true;
    }
    else    if ("OLDADDRESS".equals(__fieldName)) {
      this.OLDADDRESS = (String) __fieldVal;
      return true;
    }
    else    if ("OPENING24".equals(__fieldName)) {
      this.OPENING24 = (String) __fieldVal;
      return true;
    }
    else    if ("PID".equals(__fieldName)) {
      this.PID = (String) __fieldVal;
      return true;
    }
    else    if ("POIKIND2".equals(__fieldName)) {
      this.POIKIND2 = (String) __fieldVal;
      return true;
    }
    else    if ("POIKINDOTHER".equals(__fieldName)) {
      this.POIKINDOTHER = (String) __fieldVal;
      return true;
    }
    else    if ("LINK_PID".equals(__fieldName)) {
      this.LINK_PID = (String) __fieldVal;
      return true;
    }
    else    if ("HOTEL_RATING".equals(__fieldName)) {
      this.HOTEL_RATING = (String) __fieldVal;
      return true;
    }
    else    if ("ADMINAREACODE_15AUT".equals(__fieldName)) {
      this.ADMINAREACODE_15AUT = (String) __fieldVal;
      return true;
    }
    else    if ("POI_LEVEL".equals(__fieldName)) {
      this.POI_LEVEL = (String) __fieldVal;
      return true;
    }
    else {
      return false;    }
  }
}
