package ru.f5.project.shop.interfaces

/**
 * Сервис по работе с сообщениями
 */
interface ChatService {

    /**
     * Получение сообщения от покупателя
     *
     * @param source "место-страница" с которой покупатель обратился
     * @param userId Идентификатор покупателя
     */
    fun postMessage(source: String, userId: Int): Unit
}