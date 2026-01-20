@Entity
@Getter @Setter
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String content;

    @NotBlank
    private String author;

    @ManyToOne
    @JoinColumn(name = "post_id")
    private Post post;
}
