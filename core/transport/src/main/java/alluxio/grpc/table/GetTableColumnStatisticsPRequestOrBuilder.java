// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/table/table_master.proto

package alluxio.grpc.table;

public interface GetTableColumnStatisticsPRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:alluxio.grpc.table.GetTableColumnStatisticsPRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string db_name = 1;</code>
   */
  boolean hasDbName();
  /**
   * <code>optional string db_name = 1;</code>
   */
  java.lang.String getDbName();
  /**
   * <code>optional string db_name = 1;</code>
   */
  com.google.protobuf.ByteString
      getDbNameBytes();

  /**
   * <code>optional string table_name = 2;</code>
   */
  boolean hasTableName();
  /**
   * <code>optional string table_name = 2;</code>
   */
  java.lang.String getTableName();
  /**
   * <code>optional string table_name = 2;</code>
   */
  com.google.protobuf.ByteString
      getTableNameBytes();

  /**
   * <code>repeated string col_names = 3;</code>
   */
  java.util.List<java.lang.String>
      getColNamesList();
  /**
   * <code>repeated string col_names = 3;</code>
   */
  int getColNamesCount();
  /**
   * <code>repeated string col_names = 3;</code>
   */
  java.lang.String getColNames(int index);
  /**
   * <code>repeated string col_names = 3;</code>
   */
  com.google.protobuf.ByteString
      getColNamesBytes(int index);
}
