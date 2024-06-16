package gusta.miithersz.geekcave.models.anime;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity(name = "Anime")
@Table(name = "anime")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode(of = "animeId")
public class AnimeModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "anime_id")
    private Integer animeId;

    @Column(name = "anime_pin")
    private Boolean animePin;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_anime_title_id", referencedColumnName = "anime_title_id")
    private AnimeTitleModel animeTitle;

    @Column(name = "anime_tier")
    private String animeTier;

    // * .webp
    @Column(name = "anime_img")
    private String animeImg;

    @OneToOne(cascade = {CascadeType.MERGE, CascadeType.REFRESH})
    @JoinColumn(name = "fk_anime_studio_id", referencedColumnName = "anime_studio_id")
    private AnimeStudioModel animeStudio;

    @Column(name = "anime_sessions")
    private Integer animeSessions;
    
    // * Completed / Ep
    @Column(name = "anime_status")
    private String animeStatus;

    @Column(name = "anime_synopsis")
    private String animeSynopsis;

}