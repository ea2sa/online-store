package com.ea2sa.store.repository;

import com.ea2sa.store.domain.Shipment;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data  repository for the Shipment entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ShipmentRepository extends JpaRepository<Shipment, Long> {
}
