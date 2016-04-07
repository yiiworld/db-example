/**
 * This class is generated by jOOQ
 */
package com.bitdubai.fermat.db.sqlite.generated.tables.records;


import com.bitdubai.fermat.db.sqlite.generated.tables.NodesCatalog;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record10;
import org.jooq.Row10;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.3"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class NodesCatalogRecord extends UpdatableRecordImpl<NodesCatalogRecord> implements Record10<String, String, String, Integer, Float, Float, Integer, Integer, Integer, Integer> {

	private static final long serialVersionUID = -1957212438;

	/**
	 * Setter for <code>nodes_catalog.identity_public_key</code>.
	 */
	public void setIdentityPublicKey(String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>nodes_catalog.identity_public_key</code>.
	 */
	public String getIdentityPublicKey() {
		return (String) getValue(0);
	}

	/**
	 * Setter for <code>nodes_catalog.name</code>.
	 */
	public void setName(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>nodes_catalog.name</code>.
	 */
	public String getName() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>nodes_catalog.ip</code>.
	 */
	public void setIp(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>nodes_catalog.ip</code>.
	 */
	public String getIp() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>nodes_catalog.default_port</code>.
	 */
	public void setDefaultPort(Integer value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>nodes_catalog.default_port</code>.
	 */
	public Integer getDefaultPort() {
		return (Integer) getValue(3);
	}

	/**
	 * Setter for <code>nodes_catalog.latitude</code>.
	 */
	public void setLatitude(Float value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>nodes_catalog.latitude</code>.
	 */
	public Float getLatitude() {
		return (Float) getValue(4);
	}

	/**
	 * Setter for <code>nodes_catalog.longitude</code>.
	 */
	public void setLongitude(Float value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>nodes_catalog.longitude</code>.
	 */
	public Float getLongitude() {
		return (Float) getValue(5);
	}

	/**
	 * Setter for <code>nodes_catalog.late_notification_counter</code>.
	 */
	public void setLateNotificationCounter(Integer value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>nodes_catalog.late_notification_counter</code>.
	 */
	public Integer getLateNotificationCounter() {
		return (Integer) getValue(6);
	}

	/**
	 * Setter for <code>nodes_catalog.offline_counter</code>.
	 */
	public void setOfflineCounter(Integer value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>nodes_catalog.offline_counter</code>.
	 */
	public Integer getOfflineCounter() {
		return (Integer) getValue(7);
	}

	/**
	 * Setter for <code>nodes_catalog.registered_timestamp</code>.
	 */
	public void setRegisteredTimestamp(Integer value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>nodes_catalog.registered_timestamp</code>.
	 */
	public Integer getRegisteredTimestamp() {
		return (Integer) getValue(8);
	}

	/**
	 * Setter for <code>nodes_catalog.last_connection_timestamp</code>.
	 */
	public void setLastConnectionTimestamp(Integer value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>nodes_catalog.last_connection_timestamp</code>.
	 */
	public Integer getLastConnectionTimestamp() {
		return (Integer) getValue(9);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record1<String> key() {
		return (Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record10 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row10<String, String, String, Integer, Float, Float, Integer, Integer, Integer, Integer> fieldsRow() {
		return (Row10) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row10<String, String, String, Integer, Float, Float, Integer, Integer, Integer, Integer> valuesRow() {
		return (Row10) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field1() {
		return NodesCatalog.NODES_CATALOG.IDENTITY_PUBLIC_KEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return NodesCatalog.NODES_CATALOG.NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return NodesCatalog.NODES_CATALOG.IP;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field4() {
		return NodesCatalog.NODES_CATALOG.DEFAULT_PORT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Float> field5() {
		return NodesCatalog.NODES_CATALOG.LATITUDE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Float> field6() {
		return NodesCatalog.NODES_CATALOG.LONGITUDE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field7() {
		return NodesCatalog.NODES_CATALOG.LATE_NOTIFICATION_COUNTER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field8() {
		return NodesCatalog.NODES_CATALOG.OFFLINE_COUNTER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field9() {
		return NodesCatalog.NODES_CATALOG.REGISTERED_TIMESTAMP;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field10() {
		return NodesCatalog.NODES_CATALOG.LAST_CONNECTION_TIMESTAMP;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value1() {
		return getIdentityPublicKey();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getIp();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value4() {
		return getDefaultPort();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Float value5() {
		return getLatitude();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Float value6() {
		return getLongitude();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value7() {
		return getLateNotificationCounter();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value8() {
		return getOfflineCounter();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value9() {
		return getRegisteredTimestamp();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value10() {
		return getLastConnectionTimestamp();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public NodesCatalogRecord value1(String value) {
		setIdentityPublicKey(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public NodesCatalogRecord value2(String value) {
		setName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public NodesCatalogRecord value3(String value) {
		setIp(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public NodesCatalogRecord value4(Integer value) {
		setDefaultPort(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public NodesCatalogRecord value5(Float value) {
		setLatitude(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public NodesCatalogRecord value6(Float value) {
		setLongitude(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public NodesCatalogRecord value7(Integer value) {
		setLateNotificationCounter(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public NodesCatalogRecord value8(Integer value) {
		setOfflineCounter(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public NodesCatalogRecord value9(Integer value) {
		setRegisteredTimestamp(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public NodesCatalogRecord value10(Integer value) {
		setLastConnectionTimestamp(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public NodesCatalogRecord values(String value1, String value2, String value3, Integer value4, Float value5, Float value6, Integer value7, Integer value8, Integer value9, Integer value10) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		value7(value7);
		value8(value8);
		value9(value9);
		value10(value10);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached NodesCatalogRecord
	 */
	public NodesCatalogRecord() {
		super(NodesCatalog.NODES_CATALOG);
	}

	/**
	 * Create a detached, initialised NodesCatalogRecord
	 */
	public NodesCatalogRecord(String identityPublicKey, String name, String ip, Integer defaultPort, Float latitude, Float longitude, Integer lateNotificationCounter, Integer offlineCounter, Integer registeredTimestamp, Integer lastConnectionTimestamp) {
		super(NodesCatalog.NODES_CATALOG);

		setValue(0, identityPublicKey);
		setValue(1, name);
		setValue(2, ip);
		setValue(3, defaultPort);
		setValue(4, latitude);
		setValue(5, longitude);
		setValue(6, lateNotificationCounter);
		setValue(7, offlineCounter);
		setValue(8, registeredTimestamp);
		setValue(9, lastConnectionTimestamp);
	}
}
