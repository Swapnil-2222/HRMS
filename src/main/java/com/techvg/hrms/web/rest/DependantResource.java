package com.techvg.hrms.web.rest;

import com.techvg.hrms.repository.DependantRepository;
import com.techvg.hrms.service.DependantQueryService;
import com.techvg.hrms.service.DependantService;
import com.techvg.hrms.service.criteria.DependantCriteria;
import com.techvg.hrms.service.dto.DependantDTO;
import com.techvg.hrms.web.rest.errors.BadRequestAlertException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import tech.jhipster.web.util.HeaderUtil;
import tech.jhipster.web.util.PaginationUtil;
import tech.jhipster.web.util.ResponseUtil;

/**
 * REST controller for managing {@link com.techvg.hrms.domain.Dependant}.
 */
@RestController
@RequestMapping("/api")
public class DependantResource {

    private final Logger log = LoggerFactory.getLogger(DependantResource.class);

    private static final String ENTITY_NAME = "dependant";

    @Value("${jhipster.clientApp.name}")
    private String applicationName;

    private final DependantService dependantService;

    private final DependantRepository dependantRepository;

    private final DependantQueryService dependantQueryService;

    public DependantResource(
        DependantService dependantService,
        DependantRepository dependantRepository,
        DependantQueryService dependantQueryService
    ) {
        this.dependantService = dependantService;
        this.dependantRepository = dependantRepository;
        this.dependantQueryService = dependantQueryService;
    }

    /**
     * {@code POST  /dependants} : Create a new dependant.
     *
     * @param dependantDTO the dependantDTO to create.
     * @return the {@link ResponseEntity} with status {@code 201 (Created)} and with body the new dependantDTO, or with status {@code 400 (Bad Request)} if the dependant has already an ID.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PostMapping("/dependants")
    public ResponseEntity<DependantDTO> createDependant(@RequestBody DependantDTO dependantDTO) throws URISyntaxException {
        log.debug("REST request to save Dependant : {}", dependantDTO);
        if (dependantDTO.getId() != null) {
            throw new BadRequestAlertException("A new dependant cannot already have an ID", ENTITY_NAME, "idexists");
        }
        DependantDTO result = dependantService.save(dependantDTO);
        return ResponseEntity
            .created(new URI("/api/dependants/" + result.getId()))
            .headers(HeaderUtil.createEntityCreationAlert(applicationName, true, ENTITY_NAME, result.getId().toString()))
            .body(result);
    }

    /**
     * {@code PUT  /dependants/:id} : Updates an existing dependant.
     *
     * @param id the id of the dependantDTO to save.
     * @param dependantDTO the dependantDTO to update.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the updated dependantDTO,
     * or with status {@code 400 (Bad Request)} if the dependantDTO is not valid,
     * or with status {@code 500 (Internal Server Error)} if the dependantDTO couldn't be updated.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PutMapping("/dependants/{id}")
    public ResponseEntity<DependantDTO> updateDependant(
        @PathVariable(value = "id", required = false) final Long id,
        @RequestBody DependantDTO dependantDTO
    ) throws URISyntaxException {
        log.debug("REST request to update Dependant : {}, {}", id, dependantDTO);
        if (dependantDTO.getId() == null) {
            throw new BadRequestAlertException("Invalid id", ENTITY_NAME, "idnull");
        }
        if (!Objects.equals(id, dependantDTO.getId())) {
            throw new BadRequestAlertException("Invalid ID", ENTITY_NAME, "idinvalid");
        }

        if (!dependantRepository.existsById(id)) {
            throw new BadRequestAlertException("Entity not found", ENTITY_NAME, "idnotfound");
        }

        DependantDTO result = dependantService.update(dependantDTO);
        return ResponseEntity
            .ok()
            .headers(HeaderUtil.createEntityUpdateAlert(applicationName, true, ENTITY_NAME, dependantDTO.getId().toString()))
            .body(result);
    }

    /**
     * {@code PATCH  /dependants/:id} : Partial updates given fields of an existing dependant, field will ignore if it is null
     *
     * @param id the id of the dependantDTO to save.
     * @param dependantDTO the dependantDTO to update.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the updated dependantDTO,
     * or with status {@code 400 (Bad Request)} if the dependantDTO is not valid,
     * or with status {@code 404 (Not Found)} if the dependantDTO is not found,
     * or with status {@code 500 (Internal Server Error)} if the dependantDTO couldn't be updated.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PatchMapping(value = "/dependants/{id}", consumes = { "application/json", "application/merge-patch+json" })
    public ResponseEntity<DependantDTO> partialUpdateDependant(
        @PathVariable(value = "id", required = false) final Long id,
        @RequestBody DependantDTO dependantDTO
    ) throws URISyntaxException {
        log.debug("REST request to partial update Dependant partially : {}, {}", id, dependantDTO);
        if (dependantDTO.getId() == null) {
            throw new BadRequestAlertException("Invalid id", ENTITY_NAME, "idnull");
        }
        if (!Objects.equals(id, dependantDTO.getId())) {
            throw new BadRequestAlertException("Invalid ID", ENTITY_NAME, "idinvalid");
        }

        if (!dependantRepository.existsById(id)) {
            throw new BadRequestAlertException("Entity not found", ENTITY_NAME, "idnotfound");
        }

        Optional<DependantDTO> result = dependantService.partialUpdate(dependantDTO);

        return ResponseUtil.wrapOrNotFound(
            result,
            HeaderUtil.createEntityUpdateAlert(applicationName, true, ENTITY_NAME, dependantDTO.getId().toString())
        );
    }

    /**
     * {@code GET  /dependants} : get all the dependants.
     *
     * @param pageable the pagination information.
     * @param criteria the criteria which the requested entities should match.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and the list of dependants in body.
     */
    @GetMapping("/dependants")
    public ResponseEntity<List<DependantDTO>> getAllDependants(
        DependantCriteria criteria,
        @org.springdoc.api.annotations.ParameterObject Pageable pageable
    ) {
        log.debug("REST request to get Dependants by criteria: {}", criteria);
        Page<DependantDTO> page = dependantQueryService.findByCriteria(criteria, pageable);
        HttpHeaders headers = PaginationUtil.generatePaginationHttpHeaders(ServletUriComponentsBuilder.fromCurrentRequest(), page);
        return ResponseEntity.ok().headers(headers).body(page.getContent());
    }

    /**
     * {@code GET  /dependants/count} : count all the dependants.
     *
     * @param criteria the criteria which the requested entities should match.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and the count in body.
     */
    @GetMapping("/dependants/count")
    public ResponseEntity<Long> countDependants(DependantCriteria criteria) {
        log.debug("REST request to count Dependants by criteria: {}", criteria);
        return ResponseEntity.ok().body(dependantQueryService.countByCriteria(criteria));
    }

    /**
     * {@code GET  /dependants/:id} : get the "id" dependant.
     *
     * @param id the id of the dependantDTO to retrieve.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the dependantDTO, or with status {@code 404 (Not Found)}.
     */
    @GetMapping("/dependants/{id}")
    public ResponseEntity<DependantDTO> getDependant(@PathVariable Long id) {
        log.debug("REST request to get Dependant : {}", id);
        Optional<DependantDTO> dependantDTO = dependantService.findOne(id);
        return ResponseUtil.wrapOrNotFound(dependantDTO);
    }

    /**
     * {@code DELETE  /dependants/:id} : delete the "id" dependant.
     *
     * @param id the id of the dependantDTO to delete.
     * @return the {@link ResponseEntity} with status {@code 204 (NO_CONTENT)}.
     */
    @DeleteMapping("/dependants/{id}")
    public ResponseEntity<Void> deleteDependant(@PathVariable Long id) {
        log.debug("REST request to delete Dependant : {}", id);
        dependantService.delete(id);
        return ResponseEntity
            .noContent()
            .headers(HeaderUtil.createEntityDeletionAlert(applicationName, true, ENTITY_NAME, id.toString()))
            .build();
    }
}
