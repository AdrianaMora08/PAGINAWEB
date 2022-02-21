Swal.fire({
    icon:"success",
    title: "Haz ingresado exitosamente!",
    showLoaderOnConfirm: true,
    allowOutsideClick: false,
        preConfirm: () => {
            return new Promise((resolve) => {
                setTimeout(()=>{
                resolve()
                }, 500)
            })
        },
    })
