package org.conduitmc.api.entity;

import net.kyori.adventure.identity.Identity;
import org.conduitmc.api.data.Location;

import java.util.UUID;

public interface Entity extends Identity {
    /**
     * Retrieves the entity id of this entity,
     *
     * @return This entity's entity id
     */
    int getEntityId();

    /**
     * Retrieves the UUID of this entity
     *
     * @return UUID
     */
    UUID getUuid();

    /**
     * Retrieves the Entity Type ID
     *
     * @return Integer
     */
    int getEntityTypeId();

    /**
     * Retrieves what type of entity this is.
     *
     * @return This entity's {@link EntityType}
     */
    EntityType getType();

    /**
     * Retrieves the location of this entity (XYZ, Yaw, Pitch, OnGround).
     *
     * @return This entity's {@link Location}
     */
    Location getLocation();

    void setLocation(double x, double y, double z);

    /**
     * Sets this entity's location.
     *
     * @param location The {@link Location} to set
     */
    void setLocation(Location location);

    /**
     * Entity Categories
     */
    enum Category {
        PLAYER,
        HOSTILE,
        PASSIVE,
        MOB,
        ANIMAL,
        WATER_CREATURE,
        AMBIENT,
        LIVING,
        PROJECTILE,
        OTHER
    }
}