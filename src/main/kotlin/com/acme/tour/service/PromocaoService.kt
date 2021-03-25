package com.acme.tour.service

import com.acme.tour.model.Promocao

interface PromocaoService {
    fun getById(id: Long): Promocao?
    fun create(promocao: Promocao)
    fun delete (id: Long)
    fun update(id: Long, promocao: Promocao)
    fun searchByLocal(localFilter: String): List<Promocao>
    fun getAll(): List<Promocao>
    fun count(): Long
}