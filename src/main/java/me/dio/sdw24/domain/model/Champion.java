package me.dio.sdw24.domain.model;

public record Champion(
    Long id,
    String name,
    String role,
    String lore,
    String imageUrl
) {
    public String generateContextByQuestion(String question){

        return """
            Pergunta: %s
            Nome do Campeão ou Agente: %s
            Função:  %s
            Lore (História): %s
            """.formatted(question, this.name, this.role, this.lore);

    }
}
