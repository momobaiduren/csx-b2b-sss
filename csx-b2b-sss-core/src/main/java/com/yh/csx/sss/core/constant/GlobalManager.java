package com.yh.csx.sss.core.constant;


public final class GlobalManager {

  private GlobalManager() {
  }

  public static final String ROOT_PREFIX = "sss.boot";

  public static final String TIME_BEGIN = " 00:00:00";

  public static final String TIME_END = " 23:59:59";

  public static final Integer SERIAL_ORDER_NUMBER_START = 1000;

  public static class DatePattern {

    public static final String YYYYMMDD = "yyyy-MM-dd";

    public static final String YYYYMM = "yyyy-MM";

    public static final String YYYYMMDDHHMMSS = "yyyy-MM-dd HH:mm:ss";

    public static final String YYMMDD = "yyMMdd";
  }
}
