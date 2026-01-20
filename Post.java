@Entity
@Getter @Setter
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String title;

    @Column(length = 5000)
    private String content;

    @NotBlank
    private String author;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
