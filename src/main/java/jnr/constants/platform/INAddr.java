// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated 2010-07-31 18:57:13 +1000
package jnr.constants.platform;
public enum INAddr implements jnr.constants.Constant {
INADDR_ANY,
INADDR_BROADCAST,
INADDR_NONE,
INADDR_LOOPBACK,
INADDR_UNSPEC_GROUP,
INADDR_ALLHOSTS_GROUP,
INADDR_ALLRTRS_GROUP,
INADDR_MAX_LOCAL_GROUP,
__UNKNOWN_CONSTANT__;
private static final ConstantResolver<INAddr> resolver = 
ConstantResolver.getResolver(INAddr.class, 20000, 29999);
public final int intValue() { return (int) resolver.longValue(this); }
public final long longValue() { return resolver.longValue(this); }
public final String description() { return resolver.description(this); }
public final boolean defined() { return resolver.defined(this); }
public final String toString() { return description(); }
public static INAddr valueOf(long value) { 
    return resolver.valueOf(value);
}
}
