// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated Mon Feb 23 23:52:42 +0000 2009
package jnr.constants.platform.sunos;
public enum OpenFlags implements jnr.constants.Constant {
O_RDONLY(0),
O_WRONLY(1),
O_RDWR(2),
O_ACCMODE(3),
O_NONBLOCK(128),
O_APPEND(8),
O_SYNC(16),
// O_SHLOCK not defined
// O_EXLOCK not defined
// O_ASYNC not defined
// O_FSYNC not defined
O_NOFOLLOW(131072),
O_CREAT(256),
O_TRUNC(512),
O_EXCL(1024);
// O_EVTONLY not defined
// O_DIRECTORY not defined
// O_SYMLINK not defined
private final int value;
private OpenFlags(int value) { this.value = value; }
public static final long MIN_VALUE = 0;
public static final long MAX_VALUE = 131072;

public final int value() { return value; }
public final int intValue() { return value; }
public final long longValue() { return value; }
public final boolean defined() { return true; }
}
