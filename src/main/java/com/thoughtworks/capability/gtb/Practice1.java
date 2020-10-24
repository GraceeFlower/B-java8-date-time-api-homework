package com.thoughtworks.capability.gtb;

import java.time.LocalDate;

/**
 * 计算任意日期与下一个劳动节相差多少天
 *
 * @author itutry
 * @create 2020-05-15_16:33
 */
public class Practice1 {

  public static long getDaysBetweenNextLaborDay(LocalDate date) {
    int year = date.getYear();
    LocalDate thisLaborDay = LocalDate.of(year, 5, 1);
    if (date.isAfter(thisLaborDay)) {
      return thisLaborDay.plusYears(1).getDayOfYear() + (date.lengthOfYear() - date.getDayOfYear());
    }
    return thisLaborDay.getDayOfYear() - date.getDayOfYear();
  }
}
