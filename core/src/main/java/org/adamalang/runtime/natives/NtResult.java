/*
 * This file is subject to the terms and conditions outlined in the file 'LICENSE' (hint: it's MIT); this file is located in the root directory near the README.md which you should also read.
 *
 * This file is part of the 'Adama' project which is a programming language and document store for board games; however, it can be so much more.
 *
 * See http://www.adama-lang.org/ for more information.
 *
 * (c) 2020 - 2022 by Jeffrey M. Barber (http://jeffrey.io)
 */
package org.adamalang.runtime.natives;

/** a result for an async operation */
public class NtResult<T> {
  private T value;
  private boolean failed;
  private int failureCode;
  private String message;

  public NtResult(final T value, boolean failed, int failureCode, String message) {
    this.value = value;
    this.failed = failed;
    this.failureCode = failureCode;
    this.message = failed ? message : (value != null ? "OK" : "waiting...");
  }

  /** get the value; note; this returns null and is not appropriate for the runtime */
  public T get() {
    return this.value;
  }

  public NtMaybe<T> as_maybe() {
    if (this.value != null) {
      return new NtMaybe<>(value);
    } else {
      return new NtMaybe<>();
    }
  }

  /** is it available */
  public boolean has() {
    return value != null;
  }

  /** are we in a failure state */
  public boolean failed() {
    return failed;
  }

  /** get the message about the progress */
  public String message() {
    return message;
  }

  /** the failure code of the result */
  public int code() {
    return failureCode;
  }
}
