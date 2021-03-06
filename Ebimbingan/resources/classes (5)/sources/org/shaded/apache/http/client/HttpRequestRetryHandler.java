package org.shaded.apache.http.client;

import java.io.IOException;
import org.shaded.apache.http.protocol.HttpContext;

public interface HttpRequestRetryHandler {
    boolean retryRequest(IOException iOException, int i, HttpContext httpContext);
}
