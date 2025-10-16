document.addEventListener("DOMContentLoaded", () => {
    const toggle = document.getElementById("themeToggle");

    toggle.addEventListener("click", () => {
        document.body.classList.toggle("colorful-theme");
        toggle.textContent = document.body.classList.contains("colorful-theme")
            ? "☀️"
            : "🌈";
    });
});
