package com.back.p67260811.domain.post.post.service

import com.back.p67260811.domain.member.entity.Member
import com.back.p67260811.domain.post.comment.entity.PostComment
import com.back.p67260811.domain.post.post.entity.Post
import com.back.p67260811.domain.post.post.repository.PostRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class PostService(
    private val postRepository: PostRepository
) {

    fun write(author: Member, title: String, content: String): Post =
        postRepository.save(Post(author, title, content))

    fun writeComment(post: Post, content: String): PostComment =
        post.addComment(content)

    fun deleteComment(post: Post, commentId: Int) =
        post.removeComment(commentId)

    fun modifyComment(post: Post, commentId: Int, content: String): PostComment =
        post.modifyComment(commentId, content)

    fun findById(id: Int): Optional<Post> =
        postRepository.findById(id)

    fun findAll(): List<Post> =
        postRepository.findAll().reversed()

    fun count(): Long =
        postRepository.count()

    fun flush() =
        postRepository.flush()

    fun findCommentById(post: Post, commentId: Int): PostComment =
        post.findCommentById(commentId)

    fun delete(id: Int) =
        postRepository.deleteById(id)

    fun modify(post: Post, title: String, content: String) =
        post.update(title, content)
}
