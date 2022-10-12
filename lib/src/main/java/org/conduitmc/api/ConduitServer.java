package org.conduitmc.api;

public interface ConduitServer {
    /**
     * Get the conduit api version
     *
     * @return The current version of the conduit api
     */
    String getConduitVersion();

    /**
     * Gets the version string of this server implementation.
     *
     * @return version of this server implementation
     */
     String getServerVersion();
}
